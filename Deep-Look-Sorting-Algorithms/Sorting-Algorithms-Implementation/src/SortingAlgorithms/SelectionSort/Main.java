package SortingAlgorithms.SelectionSort;

import SortingAlgorithms.ArrayCustom;

public class Main {
    public static void main(String[] args) {
        int[] arr = {60, 30, 20,50, 10, 40, 80, 90,100,70};

        // Sort in ascending order (default)
        SelectionSort.selectionSort(arr);
        System.out.println("Ascending order using selection sort:");
        ArrayCustom.printArray(arr);

        // Sort in descending order
        SelectionSort.selectionSort(arr, true);
        System.out.println("\nDescending order using selection sort : ");
        ArrayCustom.printArray(arr);
        System.out.println("=========================================");
        // Sort in ascending order (default) recursive
        SelectionSort.selectionSortRecursive(arr);
        System.out.println("Ascending order using selection sort recursive :");
        ArrayCustom.printArray(arr);

        // Sort in descending order recursive
        SelectionSort.selectionSort(arr, true);
        System.out.println("\nDescending order using selection sort recursive :");
        ArrayCustom.printArray(arr);
    }
}
