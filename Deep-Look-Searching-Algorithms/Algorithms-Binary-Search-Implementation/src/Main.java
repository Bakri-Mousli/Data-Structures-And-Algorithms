/**
 * This program demonstrates a generic binary search method to find the index of an element in an array.
 * It includes examples of searching for both integer and string elements.
 * @author Eng.Bakri Mousli
 * @version 1.0
 */
import Domain.BinarySearch;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        // Example usage with an array of integers
        Integer[] intArray = new Integer[100_000_000];
        for (int i = 0; i < intArray.length; i+=2) {
            intArray[i] = i+1;
            intArray[i+1] = i+2;
        }
        Arrays.sort(intArray);
        int intKey = 80_700_001;
        int intResult = BinarySearch.binarySearch(intArray,0,intArray.length,intKey);

        if (intResult != -1)
            System.out.println("Integer key " + intKey + " found at index: " + intResult);
        else
            System.out.println("Integer key " + intKey + " not found in the array.");

        // Example usage with an array of strings
        String[] strArray = {"apple", "banana", "cherry", "date", "fig", "grape", "kiwi", "mango"};
        String strKey = "fig";
        int strResult = BinarySearch.binarySearchGeneric(strArray, strKey, Comparator.naturalOrder());

        if (strResult != -1)
            System.out.println("String key " + strKey + " found at index: " + strResult);
        else
            System.out.println("String key " + strKey + " not found in the array.");
        // ====================================================================
        System.out.println("Binary Search by using recursive technique design :");
        intKey = 14;
        intResult = BinarySearch.binarySearchRecursive(intArray,0,intArray.length,intKey);

        if (intResult != -1)
            System.out.println("Integer key " + intKey + " found at index: " + intResult);
        else
            System.out.println("Integer key " + intKey + " not found in the array.");



    }
}
