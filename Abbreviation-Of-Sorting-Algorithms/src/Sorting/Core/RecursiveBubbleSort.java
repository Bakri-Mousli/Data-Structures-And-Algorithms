package Sorting.Core;

public class RecursiveBubbleSort {
    public void RecursiveBubble(int arr[], int n)
    {
        if (n == 1)
            return;
        for (int i=0; i<n-1; i++)
            if (arr[i] > arr[i+1])
            {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        RecursiveBubble(arr, n-1);
    }
}
