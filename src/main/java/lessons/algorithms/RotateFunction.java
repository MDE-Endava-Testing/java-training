package lessons.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateFunction {

    /**
     * Given an array of integers A and let n to be its length.
     * <p>
     * Assume Bk to be an array obtained by rotating the array A k positions clock-wise,
     * we define a "rotation function" F on A as follow:
     * <p>
     * F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
     * <p>
     * Calculate the maximum value of F(0), F(1), ..., F(n-1).
     * <p>
     * Note: n is guaranteed to be less than 10.pow5
     * <p>
     * added 2 tests:
     * a case for null arrays to avoid nullPointerExc.
     * and another for empty arrays.
     * <p>
     * This is the best way of doing it with libraries to avoid create a new array each rotation,
     * the other solution uses no libraries and is called RotateFunctionWithNoLibraries
     */

    public static void main(String[] args) {
        RotateFunction a = new RotateFunction();
        System.out.println("Expected output: 26 Output: " + a.maxRotationMultiplier(new int[]{4, 3, 2, 6}));
        System.out.println("Expected output: 0 Output: " + a.maxRotationMultiplier(new int[]{}));
        System.out.println("Expected output: -1 Output: " + a.maxRotationMultiplier(null));
    }

    private int maxRotationMultiplier(int[] arrayOfNumbers) {
        if (arrayOfNumbers == null || arrayOfNumbers.length <= 1) {
            System.out.println("Given array is null or empty");
            return 0;
        }
        int sum = 0;
        int max = -2147483648;
        List<Integer> numbers = Arrays.stream(arrayOfNumbers).boxed().collect(Collectors.toList());
        for (int permutations = 0; permutations < numbers.size(); permutations++) {
            for (int number = 0; number < numbers.size(); number++) {
                sum = sum + (numbers.get(number) * number);
            }
            if (max < sum) max = sum;
            sum = 0;
            numbers.add(0, numbers.remove(numbers.size() - 1));
        }
        return max;
    }
}
