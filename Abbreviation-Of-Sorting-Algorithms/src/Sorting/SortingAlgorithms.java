/**
 * This program demonstrates various sorting algorithms applied to different types of arrays.
 * It allows the user to choose an algorithm and applies it to the predefined arrays.
 * @author Eng.Bakri Mousli
 * @version 1.0
 */
package Sorting;

import Sorting.Core.*;
import java.util.Scanner;

import static java.lang.System.*;

public class SortingAlgorithms {
    public static void main(String[] args) {
        Scanner input = new Scanner(in);

        // Predefined arrays
        int[] array = {3, 7, 4, 8, 6, 2, 1, 5};
        float[] arr = {(float)0.573, (float)0.338, (float)0.226, (float)0.252, (float)0.344, (float)0.338};
        Integer[] Arr = new Integer[] {42, -4, -5, 33, 30, -424, 20, 18};

        // Printing the arrays
        PrintSort printSort = new PrintSort();
        out.print("Array : "); printSort.print(array);
        out.print("Array Float : "); printSort.printFloat(arr);
        out.print("Array Integer : "); printSort.printInteger(Arr);

        // Choosing an algorithm
        ListOfAlgorithmTypes listOfAlgorithmTypes = new ListOfAlgorithmTypes();
        listOfAlgorithmTypes.ListAlgorithm();
        out.print("Enter the algorithm number : ");
        int AlgorithmNumber = input.nextInt();

        // Sorting the chosen array using the selected algorithm
        out.print("Array sported : ");
        switch (AlgorithmNumber) {
            case  1 -> new SelectionSort().sort(array);
            case  2 -> new BubbleSort().bubbleSort(array);
            case  3 -> new RecursiveBubbleSort().RecursiveBubble(array, array.length);
            case  4 -> new InsertionSort().sort(array);
            case  5 -> new RecursiveInsertionSort().insertionSortRecursive(array, array.length);
            case  6 -> new MergeSort().sort(array, 0, array.length - 1);
            case  7 -> new IterativeMergeSort().mergeSort(array);
            case  8 -> new QuickSort().qSort(array, 0, array.length - 1);
            case  9 -> new IterativeQuickSort().quickSortIterative(array, 0, array.length - 1);
            case 10 -> new HeapSort().sort(array);
            case 11 -> new CountingSort().countSort(array);
            case 12 -> new RadixSort().radixsort(array,array.length);
            case 13 -> new BucketSort().bucketSort(arr, 6);
            case 14 -> new ShellSort().sort(array);
            case 15 -> new TimSort().timSort(array, array.length);
            case 16 -> new CombSort().sort(array);
            case 17 -> new PigeonholeSort().pigeonhole_sort(array, array.length);
            case 18 -> new CycleSort().cycleSort(array, array.length);
            case 19 -> new CocktailSort().cocktailSort(array);
            case 20 -> new BitonicSort().sort(array, array.length, 1);
            case 21 -> new PancakeSorting().pancakeSort(array, array.length);
            case 22 -> new BinaryInsertionSort().insertionSort(array, array.length);
            case 23 -> new BogoSortorPermutationSort().bogo(array);
            case 24 -> new GnomeSort().gnomeSort(array, array.length);
            case 25 -> new StoogeSort().stoogesort(array, 0, array.length - 1);
            case 26 -> new mergeSort3Way().mergeSort3Way(Arr);
            case 27 -> new BrickSort().oddEvenSort(array, array.length);
            default -> out.println("Please choose another valid number.");
        }
        printSort.print(array);
    }
}
