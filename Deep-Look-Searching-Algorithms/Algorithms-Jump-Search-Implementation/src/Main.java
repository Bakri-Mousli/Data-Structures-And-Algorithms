import Domain.JumpSearch;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100_000_000];
        for (int i = 0; i < arr.length ;i++)
            arr[i] = i*2;
        System.out.println(JumpSearch.jumpSearchUsingLinearSubset(arr,80000));
        System.out.println(JumpSearch.jumpSearchUsingBinarySubset(arr,80000));
    }
}
