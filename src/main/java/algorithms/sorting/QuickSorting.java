package algorithms.sorting;

import java.util.Arrays;

public class QuickSorting {

    public int partition(int[] array, int start, int end) {
        int pivot = array[array.length - 1];
        int pIndex = start;
        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[i];
                array[i] = array[pIndex];
                array[pIndex] = temp;
                pIndex++;
            }
        }
        int temp = array[end];
        array[end] = array[pIndex];
        array[pIndex] = temp;
        System.out.println("\nsorting: " + Arrays.toString(array));
        return pIndex;
    }

    public void quickSort(int[] array, int start, int end) {
        if (start < end) {
            int pIndex = partition(array, start, end);
            quickSort(array, start, pIndex - 1);
            quickSort(array, pIndex + 1, end);
        }
    }

    public void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }


    public static void main(String[] args) {
        int[] array = {7, 2, -8, 15, 9, 10, 8, 12, 11, 13, 5, 6};
        System.out.println("Given Array: " + Arrays.toString(array));
        QuickSorting ob = new QuickSorting();
        ob.quickSort(array);
        System.out.println("\nSorted Array: " + Arrays.toString(array));
    }
}
