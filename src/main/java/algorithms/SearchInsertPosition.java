package algorithms;

public class SearchInsertPosition {

//    Given a sorted array and a target value, return the index if the target is found.
//    If not, return the index where it would be if it were inserted in order.
//
//    You may assume no duplicates in the array.

    //added 2 tests:
    // a case for null arrays to avoid nullPointerExc.
    // and another for empty arrays.

    public static void main(String[] args) {
        System.out.println("Expected output: 2 Output: " + indexSearcher(new int[]{1, 3, 5, 6}, 5));
        System.out.println("Expected output: 1 Output: " + indexSearcher(new int[]{1, 3, 5, 6}, 2));
        System.out.println("Expected output: 4 Output: " + indexSearcher(new int[]{1, 3, 5, 6}, 7));
        System.out.println("Expected output: 0 Output: " + indexSearcher(new int[]{1, 3, 5, 6}, 0));
        System.out.println("Expected output: 0 Output: " + indexSearcher(new int[]{}, 2));
        System.out.println("Expected output: -1 Output: " + indexSearcher(null, 2));
    }

    public static int indexSearcher(int[] numbers, int number) {
        if (numbers == null) {
            System.out.println("array is null");
            return -1;
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >= number) {
                return i;
            }
        }
        return numbers.length;
    }

}

