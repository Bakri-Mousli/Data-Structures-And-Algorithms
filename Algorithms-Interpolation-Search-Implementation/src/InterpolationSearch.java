public class InterpolationSearch {
    public static int interpolationSearch(int[] arr, int key) {
        int low = 0, high = arr.length - 1, mid;
        int comparisons = 0;
        while (low <= high && key >= arr[low] && key <= arr[high]) {
            // Calculate the mid using interpolation formula
            mid = low + ((high - low) / (arr[high] - arr[low])) * (key - arr[low]);
            comparisons++;

            // Check if key is found at mid
            if (arr[mid] == key){
                System.out.println("Total comparisons made: " + (comparisons));
                return mid;
            }
                // If key is smaller, ignore right half
            else if (key < arr[mid])
                high = mid - 1;
                // If key is larger, ignore left half
            else
                low = mid + 1;
        }
        return -1; // If key is not found
    }

}
