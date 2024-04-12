package SortingAlgorithms.BubbleSort;

import SortingAlgorithms.ArrayCustom;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        bubbleSort(arr, false); // Call the other version of bubbleSort with isDescending set to false
    }
    public static void bubbleSort(int[] arr, boolean isDescending){
        int size = arr.length;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (!isDescending) {
                    if (arr[j] > arr[j + 1]) {
                        ArrayCustom.swapWithoutTemp(arr,j,j+1);
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        ArrayCustom.swapWithTemp(arr,j,j+1);
                    }
                }
            }
        }
    }
    public static void bubbleSortSmart(int[] arr) {
        bubbleSortSmart(arr, false); // Call the other version of bubbleSort with isDescending set to false
    }
    public static void bubbleSortSmart(int[] arr, boolean isDescending){
        int size = arr.length; boolean flag = true;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (!isDescending) {
                    if (arr[j] > arr[j + 1]) {
                        ArrayCustom.swapWithoutTemp(arr,j,j+1);
                        flag = false;
                    }
                } else {
                    if (arr[j] < arr[j + 1]) {
                        ArrayCustom.swapWithTemp(arr,j,j+1);
                        flag = false;
                    }
                }
            }
            if(flag)
                break;
        }
    }
    public static void bubbleSortRecursive(int[] arr){
        bubbleSortRecursive(arr,arr.length,false);
    }
    public static void bubbleSortRecursive(int[] arr,boolean isDescending){
        bubbleSortRecursive(arr,arr.length,isDescending);
    }
    public static void bubbleSortRecursive(int[] arr, int size,boolean isDescending){
        if (size == 1)
            return;
        for (int i = 0; i < size - 1; i++) {
            if(!isDescending && (arr[i] > arr[i + 1]))
                ArrayCustom.swapWithoutTemp(arr, i, i + 1);
            else if(isDescending && (arr[i] < arr[i+1]))
                ArrayCustom.swapWithoutTemp(arr, i, i + 1);
        }
        bubbleSortRecursive(arr, size - 1,isDescending);
    }

}
