package Domain;

import java.util.Comparator;
public class BinarySearch  {
    /**
     * Performs binary search on a sorted array to find the index of a specified key.
     //* @param <T> the type of elements in the array
     //* @param array the sorted array to be searched
     //* @param key the key to search for in the array
     //* @param comparator the comparator to compare elements of the array
     * @return the index of the key if found, or -1 if not found
     */
    public static int binarySearch(Integer[] array,int low,int high, int key){
        int comparisons = 0;

        while (low<high){
            comparisons++;
            int mid = (low+high)/2;
            if(key > array[mid])
                low = mid + 1;
            else if(key < array[mid])
                high = mid - 1;
            else{
                System.out.println("Total comparisons made: " + (comparisons));
                return mid; //key found
            }
        }

        return -1;//key not found
    }
    public static <T> int binarySearchGeneric(T[] array, T key, Comparator<? super T> comparator) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = comparator.compare(array[mid], key);

            if (cmp == 0)
                return mid;
            else if (cmp < 0)
                low = mid + 1;
             else
                high = mid - 1;

        }

        return -1;
    }
    public static int binarySearchRecursive(Integer[] a, int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (a[mid] == key)
                return mid;
            else if(key < a[mid])
                return binarySearchRecursive(a, low, mid-1, key);
            else if (a[mid] < key)
                return binarySearchRecursive(a, mid+1, high, key);
        }
        return -1;
    }
}
