package SearchGenerics.Core;

public class ExponentialSearch {
    public static <T extends Comparable<T>> int exponentialSearch(T[] arr, int n, T x) {
        if (arr[0].equals(x))
            return 0;
        int i = 1;
        while (i < n && arr[i].compareTo(x) <= 0)
            i = i * 2;
        return BinarySearch.binarySearch(arr, i / 2, Math.min(i, n - 1), x);
    }

}