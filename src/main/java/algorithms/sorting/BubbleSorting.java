package algorithms.sorting;

import java.util.Arrays;

public class BubbleSorting {

    void sort(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            for (int j = 0; j < n-i-1; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public static void main(String args[])
    {
        BubbleSorting ob = new BubbleSorting();
        int array[] = {64,25,12,22,11};
        ob.sort(array);
        System.out.println("\nSorted Array: "+ Arrays.toString(array));
    }
}
