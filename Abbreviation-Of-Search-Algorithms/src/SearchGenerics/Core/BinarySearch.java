package SearchGenerics.Core;

public class BinarySearch {
    public static <T extends Comparable<T>> int binarySearch(T[] arr, int l, int r, T key) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            if (arr[mid].equals(key))
                return mid;

            if (arr[mid].compareTo(key) > 0)
                return BinarySearch.binarySearch(arr, l, mid - 1, key);
            return BinarySearch.binarySearch(arr, mid + 1, r, key);
        }
        return -1;
    }
}