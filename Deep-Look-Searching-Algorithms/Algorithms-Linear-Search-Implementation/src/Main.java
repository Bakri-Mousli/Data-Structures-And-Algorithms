/**
 * This program demonstrates a generic linear search method to find the index of an element in an array.
 * It includes examples of searching for both integer and string elements.
 * @author Eng.Bakri Mousli
 * @version 1.0
 */

import Domain.LinearSearch;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Integer array example
        Integer[] intArray = {12, 44, 32, 18, 4, 10, 66};
        System.out.println("Enter an element to search for in the integer array:");
        int intKey = input.nextInt();
        int intResult = LinearSearch.linearSearchGeneric(intArray, intKey);

        if(intResult != -1)
            System.out.println("The element " + intKey + " was found at index: " + intResult);
        else
            System.out.println("The element " + intKey + " was not found in the integer array.");

        //======================================================================
        // String array example
        String[] strArray = {"banana", "apple", "Orange", "white", "red", "blue"};
        System.out.println("Enter an element to search for in the string array:");
        String strKey = input.next();
        int strResult = LinearSearch.linearSearchGeneric(strArray, strKey);

        if(strResult != -1)
            System.out.println("The element " + strKey + " was found at index: " + strResult);
        else
            System.out.println("The element " + strKey + " was not found in the string array.");

        //======================================================================
        System.out.println("Linear Search Recursive Calling : ");
        int index = LinearSearch.linearSearchRecursive(intArray, intKey, 0);
        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found in the array.");
    }
}
