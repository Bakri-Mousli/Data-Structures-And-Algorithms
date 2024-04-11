package Domain;

/**
 * Exponential Search algorithm to search for a target value in a sorted array.
 * Exponential Search involves doubling the index with each step until a range containing the target is found,
 * then performing a binary search within that range.
 //* @param arr    The sorted array to search.
 //* @param target The value to search for.
 //* @return       The index of the target value in the array, or -1 if not found.
 */
public class ExponentialSearch {
    /**
     * Performs an exponential search for the target value in the given sorted array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @return       The index of the target value in the array, or -1 if not found.
     */
    public static int exponentialSearch(int[] arr, int target) {
        int n = arr.length;
        if (arr[0] == target)
            return 0; // Target is found at index 0

        // Double the index in each step until a range containing the target is found
        int i = 1;
        while (i < n && arr[i] <= target)
            i *= 2;

        // Perform binary search within the range [i/2, min(i, n-1)]
        return binarySearch(arr, target, i / 2, Math.min(i, n - 1));
    }
    /**
     * Performs binary search within the specified range of the array.
     *
     * @param arr    The sorted array to search.
     * @param target The value to search for.
     * @param left   The left index of the range to search within.
     * @param right  The right index of the range to search within.
     * @return       The index of the target value in the array, or -1 if not found.
     */
    private static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // Check if the target is found at the middle element
            if (arr[mid] == target)
                return mid; // Target is found at index 'mid'
            // Determine the next range to search based on the middle element
            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1; // Target not found in the specified range
    }
}
