package Domain;

public class LinearSearch {
    /**
     * Performs a linear search to find the index of a specified key in the array.
     * @param <T> the type of elements in the array
     * @param array the array to be searched
     * @param key the key to search for in the array
     * @return the index of the key if found, or -1 if not found
     */
    public static <T> int linearSearchGeneric(T[] array, T key){
        for (int index = 0; index < array.length; ++index) {
            if (array[index].equals(key))
                return index;
        }
        return -1;
    }
    public static int linearSearch(int[] array, int key){
        for (int index = 0; index < array.length; ++index) {
            if (array[index] == key)
                return index;
        }
        return -1;
    }
    public static int linearSearchRecursive(Integer[] array, int key, int index) {
        // Base case: If the index is equal to the array length, the element is not found
        if (index == array.length)
            return -1;
        // Check if the current element is equal to the key
        if (array[index] == key)
            return index;
        // Recursive case: Search in the rest of the array
        return linearSearchRecursive(array, key, index + 1);
    }
}
