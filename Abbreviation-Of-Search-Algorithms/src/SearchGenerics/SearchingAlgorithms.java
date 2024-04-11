/**
 * This program demonstrates a generic search algorithm to find the index of an element in an array.
 * It includes examples of searching for both integer and character elements.
 *
 * @author Eng.Bakri Mousli
 * @version 1.0
 */
package SearchGenerics;

import SearchGenerics.Core.*;
import java.util.Random;
import java.util.Scanner;

public class SearchingAlgorithms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Generating and printing random Integer array
        System.out.println("================ Search Numbers Array =================");
        Integer[] numbersArr = new Integer[1000];
        Random random = new Random();
        for (int i = 0; i < 1000; i++)
            numbersArr[i] = random.nextInt(91) + 10; // Generates a random integer in the range 10-100
        Array.print(numbersArr);

        // Searching for Integer elements
        while (true) {
            System.out.println("0- Exit...\n1- Linear Search\n2- Binary Search\n3- Jump Search\n4- Interpolation Search\n5- Exponential Search\n6- Fibonacci Search");
            System.out.print("Enter the number of the search algorithm: ");
            int selectedNumber = input.nextInt();
            if (selectedNumber == 0) {
                System.out.println("\nExiting the program...");
                break;
            }
            System.out.print("Enter the number to search in the array: ");
            Integer number = input.nextInt();
            int result = -1;
            switch (selectedNumber) {
                case 1 -> result = LinearSearch.linearSearch(numbersArr, number);
                case 2 -> result = BinarySearch.binarySearch(numbersArr, 0, numbersArr.length - 1, number);
                case 3 -> result = JumpSearch.jumpSearch(numbersArr, number);
                case 4 -> result = InterpolationSearch.interpolationSearch(numbersArr, 0, numbersArr.length - 1, number);
                case 5 -> result = ExponentialSearch.exponentialSearch(numbersArr, numbersArr.length, number);
                case 6 -> result = FibonacciSearch.fibMonacanSearch(numbersArr, number, numbersArr.length);
            }
            if (result == -1)
                System.out.println("Element not found in the array.");
            else
                System.out.println("Element found at index " + result);
        }

        // Generating and printing random Character array
        System.out.println("================ Search Chars Array =================");
        Character[] charsArr = new Character[26];
        for (int i = 'a'; i <= (int) 'z'; i++) // for i=97 to i<123 ASCII code of small letters
            charsArr[i - 97] = (char) i;
        // Shuffle the array using random class and can be using collection.shuffle method
        Random rand = new Random();
        for (int i = 0; i < charsArr.length; i++) {
            int randomIndexToSwap = rand.nextInt(charsArr.length);
            char temp = charsArr[randomIndexToSwap];
            charsArr[randomIndexToSwap] = charsArr[i];
            charsArr[i] = temp;
        }
        Array.print(charsArr);

        // Searching for Character elements
        while (true) {
            System.out.println("0- Exit...\n1- Linear Search\n2- Binary Search\n3- Jump Search\n4- Interpolation Search\n5- Exponential Search\n6- Fibonacci Search");
            System.out.print("Enter the number of the search algorithm: ");
            int selectedNumber = input.nextInt();
            if (selectedNumber == 0) {
                System.out.println("\nExiting the program...");
                break;
            }
            System.out.print("Enter the character to search in the array: ");
            // Read the first character of the input string
            Character character = input.next().charAt(0);
            int result = -1;
            switch (selectedNumber) {
                case 1 -> result = LinearSearch.linearSearch(charsArr, character);
                case 2 -> result = BinarySearch.binarySearch(charsArr, 0, numbersArr.length - 1, character);
                case 3 -> result = JumpSearch.jumpSearch(charsArr, character);
                case 4 -> result = InterpolationSearch.interpolationSearch(charsArr, 0, numbersArr.length - 1, character);
                case 5 -> result = ExponentialSearch.exponentialSearch(charsArr, numbersArr.length, character);
                case 6 -> result = FibonacciSearch.fibMonacanSearch(charsArr, character, charsArr.length);
            }
            if (result == -1)
                System.out.println("Element not found in the array.");
            else
                System.out.println("Element found at index " + result);
        }
    }
}
