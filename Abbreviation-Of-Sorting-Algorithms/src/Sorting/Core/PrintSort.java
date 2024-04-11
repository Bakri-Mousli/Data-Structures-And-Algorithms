package Sorting.Core;

public class PrintSort {
    public void print(int[] arr){
        int n = arr.length;
        for (int j : arr)
            System.out.print(j + " ");
        System.out.println();
    }
    public void printFloat(float[] arr){
        for (float a: arr)
            System.out.print(a+" ");
        System.out.println();
    }
    public void printInteger(Integer[] Arr){
        for (Integer integer : Arr)
            System.out.print(integer + " ");
    }
}
