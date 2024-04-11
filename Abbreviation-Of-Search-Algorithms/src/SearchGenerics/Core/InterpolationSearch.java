package SearchGenerics.Core;

public class InterpolationSearch {
    public static <T extends Comparable<T>> int interpolationSearch(T[] arr, int lo, int hi, T x) {
        if (lo <= hi && x.compareTo(arr[lo]) >= 0 && x.compareTo(arr[hi]) <= 0) {
            int pos = lo + (((hi - lo) / (arr[hi].compareTo(arr[lo])))
                    * (x.compareTo(arr[lo])));
            if (arr[pos].equals(x))
                return pos;
            if (arr[pos].compareTo(x) < 0)
                return interpolationSearch(arr, pos + 1, hi, x);
            if (arr[pos].compareTo(x) > 0)
                return interpolationSearch(arr, lo, pos - 1, x);
        }
        return -1;
    }

}
