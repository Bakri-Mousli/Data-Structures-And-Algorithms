package SortingAlgorithms.BubbleSort;
import SortingAlgorithms.ArrayCustom;
public class Main {
    public static void main(String[] args) {
        int[] arr = {60, 30, 20, 10, 40, 80, 90,100,70};

        // Sort in ascending order (default)
        BubbleSort.bubbleSort(arr);
        System.out.println("Ascending order using bubble sort:");
        ArrayCustom.printArray(arr);

        // Sort in descending order
        BubbleSort.bubbleSort(arr, true);
        System.out.println("\nDescending order using bubble sort:");
        ArrayCustom.printArray(arr);
        System.out.println("=========================================");
        // Sort in ascending order (default) recursive
        BubbleSort.bubbleSortRecursive(arr);
        System.out.println("Ascending order using bubble sort recursive:");
        ArrayCustom.printArray(arr);

        // Sort in descending order recursive
        BubbleSort.bubbleSortRecursive(arr, true);
        System.out.println("\nDescending order using bubble sort recursive:");
        ArrayCustom.printArray(arr);
    }

}
