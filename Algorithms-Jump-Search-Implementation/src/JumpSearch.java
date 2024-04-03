public class JumpSearch {
    /**
     * JumpSearch algorithm to find an element in a sorted array.
     *
     * @param arr The sorted array to search in.
     * @param key The element to search for.
     * @return The index of the key if found, otherwise -1.
     */
    public static int jumpSearchUsingLinearSubset(int[] arr, int key) {
        int n = arr.length;
        int jumpSize = (int) Math.sqrt(n); // Determine the jump size
        System.out.println("Jump size by linear search in sub set is : "+jumpSize);

        // Jumping through blocks
        int left = 0;
        int right = 0;
        while (right < n && arr[right] < key) {
            left = right; // Set the lower bound of the subArray
            right = Math.min(n - 1, right + jumpSize); // Set the upper bound of the subArray
        }
        // Linear search in the subArray
        for (int i = left; i <= right; i++) {
            if (arr[i] == key)
                return i; // If the key is found
        }

        return -1; // If the key is not found
    }
    public static int jumpSearchUsingBinarySubset(int[] arr, int key){
        int n = arr.length;
        int jumpSize = (int)Math.sqrt(n);
        System.out.println("jump size by binary search in sub set is : "+jumpSize);
        int left = 0;
        int right = 0;
        while (right < n && arr[right] < key) {
            left = right;
            right = Math.min(n - 1, right + jumpSize);
        }

        // Binary search in the subArray instead of linear search
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key)
                return mid;
            else if (arr[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }
}
