package lessons.algorithms.cryptatarithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class Circuits {

    public static void main(String[] args) {
        System.out.println("All matches :: ");
        byFactors(90, 4, 5, 6).forEach(i -> System.out.print(i + ", "));
        System.out.println("\nNo matches :: ");
        noMatches(90, 4, 5, 6).forEach(i -> System.out.print(i + ", "));
    }

    private static List<Integer> byFactors(int range, int f1, int f2, int f3) {
        List<Integer> matches = new ArrayList<>();
        IntStream.range(0, range).filter(i -> (i % f1 == 0) & (i % f2 == 0) & (i % f3 == 0))
                .mapToObj(i -> matches.add(i)).collect(toList());
        return matches;
    }

    private static List<Integer> noMatches(int range, int f1, int f2, int f3) {
        List<Integer> matches = new ArrayList<>();
        IntStream.range(0, range).filter(i -> (i % f1 != 0) & (i % f2 != 0) & (i % f3 != 0) & (i % 3 != 0)& (i % 2 != 0))
                .mapToObj(i -> matches.add(i)).collect(toList());
        return matches;
    }

//    private static List<Integer> primeFinder(int range) {
//        List<Integer> primes = new ArrayList<>();
//        IntStream.range(0, range).filter(i -> isPrime(i))
//                .mapToObj(i -> primes.add(i)).collect(toList());
//        return primes;
//    }
//
//    private static boolean isPrime(int n) {
//        if (n <= 1 || n % 2 == 0) return false;
//        else if (n == 2) return true;
//        for (int i = 3; i <= Math.sqrt(n); i += 2) {
//            if (n % i == 0) return false;
//        }
//        return true;
//    }

}

