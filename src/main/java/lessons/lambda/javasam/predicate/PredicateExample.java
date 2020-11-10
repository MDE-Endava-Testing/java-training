package lessons.lambda.javasam.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        Predicate<Integer> isGreaterThanTwo = n -> n > 2;
        Predicate<Integer> isLessThanTen = n -> n < 10;

        Predicate<String> isBlank = e -> e.trim().length() == 0;
        Predicate<String> isNotBlank = e -> e.trim().length() != 0;
        Predicate<String> hasKeyword = e -> e.contains("pizza");



        //System.out.println(isGreaterThanTwo.test(5));

//        System.out.println(isBlank.test("        "));
        System.out.println(hasKeyword.test("        "));
        System.out.println(hasKeyword.test("   pizza     "));
        System.out.println("false :: " + isBlank.negate().test("   "));
        System.out.println("true :: " + isNotBlank.test(" a "));
                 //       (a&b)&c
        System.out.println("??? :: " + isBlank.negate().and(hasKeyword).test("  pizza "));


        //and, or, negate() examples

    }

    public boolean isblankFillWithText(String e){
        return e.trim().length() == 0;
    }
}
