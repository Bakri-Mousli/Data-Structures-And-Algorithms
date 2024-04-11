package Sorting.Core;

import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public void bucketSort(float[] arr, int n) {
        if (n <= 0)
            return;
        @SuppressWarnings("unchecked")
        ArrayList<Float>[] bucket = new ArrayList[n];
        for (int i = 0; i < n; i++)
            bucket[i] = new ArrayList<Float>();
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            bucket[bucketIndex].add(arr[i]);
        }

        for (int i = 0; i < n; i++) {
            Collections.sort((bucket[i]));
        }

        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0, size = bucket[i].size(); j < size; j++) {
                arr[index++] = bucket[i].get(j);
            }
        }
    }
}