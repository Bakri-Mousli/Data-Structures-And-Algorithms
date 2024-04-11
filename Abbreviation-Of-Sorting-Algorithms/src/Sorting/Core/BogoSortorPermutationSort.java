package Sorting.Core;

public class BogoSortorPermutationSort {
    public void bogo(int[] arr)
    {
        int s=1;
        for(;!isSorted(arr);s++)
            s(arr);
    }
    void s(int[] arr)
    {
        int i=arr.length-1;
        while(i>0)
            swap(arr,i--,(int)(Math.random()*i));
    }
    void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    boolean isSorted(int[] arr)
    {

        for(int i=1;i<arr.length;i++)
            if(arr[i]<arr[i-1])
                return false;
        return true;
    }
}