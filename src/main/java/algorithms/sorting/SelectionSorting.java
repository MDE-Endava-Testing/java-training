package algorithms.sorting;

import java.util.Arrays;

public class SelectionSorting {

    void sort(int[] array)
    {
        int n = array.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (array[j] < array[min_idx])
                    min_idx = j;
            }
            int temp = array[min_idx];
            array[min_idx] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args)
    {
        SelectionSorting ob = new SelectionSorting();
        int[] array = {64,25,12,22,11};
        ob.sort(array);
        System.out.println("\nSorted Array: "+ Arrays.toString(array));
    }
}
