package algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RotateFunction {

//    Given an array of integers A and let n to be its length.
//
//    Assume Bk to be an array obtained by rotating the array A k positions clock-wise,
//    we define a "rotation function" F on A as follow:
//
//    F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1].
//
//    Calculate the maximum value of F(0), F(1), ..., F(n-1).
//
//    Note: n is guaranteed to be less than 10.pow5

    public static void main(String[] args) {
        System.out.println("Expected output: 26 Output: " + maxRotationMultiplier(new int[]{4, 3, 2, 6}));
        System.out.println("Expected output: 0 Output: " + maxRotationMultiplier(new int[]{}));
        System.out.println("Expected output: -1 Output: " + maxRotationMultiplier(null));


    }

    public static int maxRotationMultiplier(int[] arrayOfNumbers) {
        int sum = 0;
        int max = 0;
        if (arrayOfNumbers == null) {
            System.out.println("array is null");
            return -1;
        }
        List<Integer> numbers = Arrays.stream(arrayOfNumbers).boxed().collect(Collectors.toList());
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers.size(); j++) {
                sum = sum + (numbers.get(j) * j);
            }
            if (max < sum) max = sum;
            sum = 0;
            numbers.add(0, numbers.remove(numbers.size() - 1));
        }
        return max;


    }
}
