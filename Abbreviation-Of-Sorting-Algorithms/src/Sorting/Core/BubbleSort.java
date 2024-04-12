package Sorting.Core;

public class BubbleSort {
    public void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    swap(arr[j],arr[j+1]);
                    //int temp = arr[j];
                    //arr[j] = arr[j+1];
                    //arr[j+1] = temp;
                }
    }
    private void swap(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
    }
}
