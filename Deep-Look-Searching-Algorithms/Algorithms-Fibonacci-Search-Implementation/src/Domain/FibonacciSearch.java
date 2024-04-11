package Domain;

/**
 * Fibonacci Search algorithm to search for a target value in a sorted array.
 * Fibonacci Search uses Fibonacci numbers to determine the split points during the search.
 //* @param arr    The sorted array to search.
 //* @param target The value to search for.
 //* @return       The index of the target value in the array, or -1 if not found.
 */
public class FibonacciSearch {

    /**
     * Performs a Fibonacci Search for the target value in the given sorted array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return       The index of the target value in the array, or -1 if not found.
     */
    public static int fibonacciSearch(int[] arr, int target) {
        int n = arr.length;
        int fibM_minus_2 = 0;
        int fibM_minus_1 = 1;
        int fibM = fibM_minus_1 + fibM_minus_2;

        while (fibM < n) {
            fibM_minus_2 = fibM_minus_1;
            fibM_minus_1 = fibM;
            fibM = fibM_minus_1 + fibM_minus_2;
        }

        int offset = -1;

        while (fibM > 1) {
            int i = Math.min(offset + fibM_minus_2, n - 1);

            if (arr[i] < target) {
                fibM = fibM_minus_1;
                fibM_minus_1 = fibM_minus_2;
                fibM_minus_2 = fibM - fibM_minus_1;
                offset = i;
            } else if (arr[i] > target) {
                fibM = fibM_minus_2;
                fibM_minus_1 -= fibM_minus_2;
                fibM_minus_2 = fibM - fibM_minus_1;
            } else {
                return i;
            }
        }

        if (fibM_minus_1 == 1 && arr[offset + 1] == target)
            return offset + 1;

        return -1;
    }

}
