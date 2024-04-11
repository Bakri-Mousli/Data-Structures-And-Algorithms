import Domain.FibonacciSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 22, 35, 40, 45, 50, 80, 82, 85, 90, 100};
        int target = 85;
        int result = FibonacciSearch.fibonacciSearch(arr, target);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found in the array");
    }
}
