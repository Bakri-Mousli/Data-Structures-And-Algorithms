
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100_000_000];
        for (int i = 0; i < arr.length; i+=2) {
            arr[i] = i+1;
            arr[i+1] = i+2;
        }
        int key = 80_700_001;
        int result = InterpolationSearch.interpolationSearch(arr, key);
        if (result != -1)
            System.out.println("Element found at index " + result);
        else
            System.out.println("Element not found");

    }
}
