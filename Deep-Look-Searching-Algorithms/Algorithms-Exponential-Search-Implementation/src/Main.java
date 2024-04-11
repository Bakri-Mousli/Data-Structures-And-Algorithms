import Domain.ExponentialSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 10, 40};
        int target = 30;
        int result = ExponentialSearch.exponentialSearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found in the array");
    }
}
