package SearchGenerics.Core;
public class Array {
    public static <T> void print(T[] array){
        System.out.print("array : ");
        for (T item : array)
            System.out.print(item + " ");
        System.out.println();
    }
    public static <T extends Comparable<T>> void printSort(T[] array){
        T[] tempArr = array.clone();
        bubbleSortGeneric(tempArr);
        System.out.print("array sorted : ");
        for (T item : array)
            System.out.print(item + " ");
    }
    private static <T extends Comparable<T>> void bubbleSortGeneric(T[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
        }
    }

}
