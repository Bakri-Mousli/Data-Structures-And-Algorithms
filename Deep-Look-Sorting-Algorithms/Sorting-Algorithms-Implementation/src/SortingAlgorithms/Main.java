package SortingAlgorithms;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,3,3,6,8,8,8,8,9,10,10,10};
        for (int i : arr)
            System.out.print(i+"  ");
        System.out.println();
        ArrayCustom.shuffleArray(arr);
        for (int i : arr)
            System.out.print(i+"  ");
        System.out.println();

        ArrayCustom.findFrequency(arr);
    }
}
