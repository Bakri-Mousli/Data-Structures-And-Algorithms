package SortingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;
public class ArrayCustom {
    public static ArrayList<Integer> findDuplicates(int[] arr){
        Arrays.sort(arr);
        ArrayList<Integer> duplicatesArr = new ArrayList<Integer>();
        for (int i = 0; i < arr.length -1; i++) {
            if (arr[i] == arr[i+1])
                duplicatesArr.add(arr[i]);
            while ((i < arr.length - 1 ) && (arr[i] == arr[i+1]))
                i++;
        }
        return duplicatesArr;
    }
    public static void findFrequency(int[] arr) {
        // Create a HashMap to store the frequency of each item
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each item in the array
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print each item with its frequency
        System.out.println("Item : Frequency");
        for (int key : frequencyMap.keySet()) {
            System.out.println(key + " : " + frequencyMap.get(key));
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }
    public static void shuffleArray(int[] arr){
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = random.nextInt(arr.length -i )+i;
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }

    }
    public static void swapWithoutTemp(int[] arr,int index1, int index2){
        // Swapping without using a temporary variable
        arr[index1] = arr[index1] + arr[index2];
        arr[index2] = arr[index1] - arr[index2];
        arr[index1] = arr[index1] - arr[index2];
    }
    public static void swapWithTemp(int[] arr,int index1, int index2){
        // Swapping with using a temporary variable
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
