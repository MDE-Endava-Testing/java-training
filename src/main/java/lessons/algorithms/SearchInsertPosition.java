package lessons.algorithms;

public class SearchInsertPosition {

    /**
     * Given a sorted array and a target value, return the index if the target is found.
     * If not, return the index where it would be if it were inserted in order.
     * <p>
     * You may assume no duplicates in the array.
     * <p>
     * added 2 tests:
     * a case for null arrays to avoid nullPointerExc.
     * and another for empty arrays.
     */

    public static void main(String[] args) {
        SearchInsertPosition a = new SearchInsertPosition();
        System.out.println("Expected output: 2 Output: " + a.indexSearcher(new int[]{1, 3, 5, 6}, 5));
        System.out.println("Expected output: 1 Output: " + a.indexSearcher(new int[]{1, 3, 5, 6}, 2));
        System.out.println("Expected output: 4 Output: " + a.indexSearcher(new int[]{1, 3, 5, 6}, 7));
        System.out.println("Expected output: 0 Output: " + a.indexSearcher(new int[]{1, 3, 5, 6}, 0));
        System.out.println("Expected output: 0 Output: " + a.indexSearcher(new int[]{}, 2));
        System.out.println("Expected output: -1 Output: " + a.indexSearcher(null, 2));
    }

    private int indexSearcher(int[] numbers, int number) {
        if (numbers == null) {
            System.out.println("array is null");
            return -1;
        }
        for (int digit = 0; digit < numbers.length; digit++) {
            if (numbers[digit] >= number) {
                return digit;
            }
        }
        return numbers.length;
    }

}

