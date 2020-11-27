package lessons.algorithms.cryptatarithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingularCases {

    public static void main(String[] args) {

        int multiply;

        List<String> singulars = new ArrayList<>();
        List<Integer> w = numGen(1);
        List<Integer> xx = numGen(2);
        List<Integer> yyy = numGen(3);
        List<Integer> vvvv = numGen(4);

        for (int u : w) {
            for (int b : vvvv) {
                if (isSingular(u, b, u * b)) singulars.add(u + " * " + b + " = " + u * b);
            }
        }
        for (int x : xx) {
            for (int y : yyy) {
                if (isSingular(x, y, x * y)) singulars.add(x + " * " + y + " = " + x * y);
            }
        }
        System.out.println("\nResults :: ");
        singulars.forEach(i -> System.out.println(i + " "));
    }

    private static List<Integer> numGen(int digits) {
        List<Integer> numbers = new ArrayList<>();
        String numToString;

        for (int i = (int) Math.pow(10, digits - 1); i < (int) Math.pow(10, digits) - 1; i++) {
            numToString = Stream.of(String.valueOf(i).split(""))
                    .distinct().collect(Collectors.joining());
            numToString = numToString.replaceAll("0", "");
            if (numToString.length() == digits) numbers.add(i);
        }
        return numbers;

    }

    private static boolean isSingular(int x, int y, int z) {
        int zNoZero = Integer.parseInt(String.valueOf(z).replaceAll("0", ""));
        if (zNoZero != z) return false;
        String number = ("" + x + y + z);
        String withOutDuplicates = Stream.of(number.split(""))
                .distinct().collect(Collectors.joining());
        return number.length() == 9 && !(number.length() != withOutDuplicates.length());
    }
}
