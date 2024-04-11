package SearchGenerics.Core;

public class FibonacciSearch {
    public static int min(int x, int y)
    {
        return Math.min(x, y);
    }
    public static <T extends Comparable<T>> int fibMonacanSearch(T[] arr, T x, int n) {
        int fibMMm2 = 0;
        int fibMMm1 = 1;
        int fibM = fibMMm2 + fibMMm1;

        while (fibM < n) {
            fibMMm2 = fibMMm1;
            fibMMm1 = fibM;
            fibM = fibMMm2 + fibMMm1;
        }

        int offset = -1;
        while (fibM > 1) {
            int i = Math.min(offset + fibMMm2, n - 1);
            if (arr[i].compareTo(x) < 0) {
                fibM = fibMMm1;
                fibMMm1 = fibMMm2;
                fibMMm2 = fibM - fibMMm1;
                offset = i;
            } else if (arr[i].compareTo(x) > 0) {
                fibM = fibMMm2;
                fibMMm1 = fibMMm1 - fibMMm2;
                fibMMm2 = fibM - fibMMm1;
            } else {
                return i;
            }
        }

        if (fibMMm1 == 1 && arr[n - 1].equals(x)) {
            return n - 1;
        }

        return -1;
    }

}
