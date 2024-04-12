package SortingAlgorithms.SelectionSort;

import SortingAlgorithms.ArrayCustom;

public class SelectionSort {
    public static void selectionSort(int[] arr){
        selectionSort(arr,false);
    }
    public static void selectionSort(int[] arr,boolean isDescending){
        for (int i = 0; i < arr.length - 1; i++) {
            int extremeIndex = i;
            for (int j = i + 1; j < arr.length; j++)
                if ((isDescending && arr[j] > arr[extremeIndex])
                     || (!isDescending && arr[j] < arr[extremeIndex]))
                    extremeIndex = j;

            if(i!=extremeIndex)
                ArrayCustom.swapWithTemp(arr, i, extremeIndex);
        }
    }
    public static void selectionSortRecursive(int[] arr) {
        selectionSortRecursive(arr,0);
    }
    public static void selectionSortRecursive(int[] arr, int startIndex){
        if (startIndex >= arr.length - 1)
            return;
        int extremeIndex = startIndex;
        for (int i = startIndex +1; i < arr.length; i++) {
            if(arr[i] < arr[extremeIndex])
                extremeIndex = i;
        }
        if (extremeIndex != startIndex)
            ArrayCustom.swapWithoutTemp(arr,startIndex,extremeIndex);

        selectionSortRecursive(arr,startIndex+1);
    }


}
