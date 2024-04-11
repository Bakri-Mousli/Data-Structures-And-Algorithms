package SearchGenerics.Core;

public class JumpSearch {
    public static <T extends Comparable<T>> int jumpSearch(T[] arr, T key) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;
        while (arr[Math.min(step, n) - 1].compareTo(key) < 0) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }
        while (arr[prev].compareTo(key) < 0) {
            prev++;
            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev].equals(key))
            return prev;

        return -1;
    }

}
