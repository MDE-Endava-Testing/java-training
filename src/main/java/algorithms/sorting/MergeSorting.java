package algorithms.sorting;

import java.util.Arrays;

public class MergeSorting {

    public void merge(int[] left, int[] right, int[] array) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;
        while (i < leftLength && j < rightLength) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < leftLength) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    public void mergeSort(int[] array) {
        int arrayLength = array.length;
        if (arrayLength > 1) {
            int mid = arrayLength / 2;
            int[] left = new int[mid];
            int[] right = new int[arrayLength - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }
            for (int i = mid; i < arrayLength; i++) {
                right[i - mid] = array[i];
            }
            System.out.println("\nL: " + Arrays.toString(left)+ " R: " + Arrays.toString(right));
            mergeSort(left);
            mergeSort(right);
            merge(left, right, array);
        }
    }

    public static void main(String[] args) {
        int[] array = {12, 11, 13, 5, 6, 7, 8};
        System.out.println("Given Array: "+ Arrays.toString(array));
        MergeSorting ob = new MergeSorting();
        ob.mergeSort(array);
        System.out.println("\nSorted Array: "+ Arrays.toString(array));
    }



}
