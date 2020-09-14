package algorithms;

import java.util.stream.IntStream;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println("    " + checkPalindrome("ada"));
        System.out.println("    " + checkPalindrome("adabr43r3rfewfs"));
        System.out.println("    " + checkPalindrome("abab"));
        System.out.println("    " + checkPalindrome(null));
        System.out.println("    " + checkPalindrome("King, are you glad you are king"));
        System.out.println("    " + checkPalindrome("a a a"));
        System.out.println("    " + checkPalindrome("a Ba a"));
    }

    private static boolean checkPalindrome(String input) {
        if (input == null) return true;
        String inputString = input.replaceAll("[^a-z A-Z]", "").toLowerCase();
        String[] stringArray = inputString.split(" ");
        if (stringArray.length > 1) {
            return IntStream.range(0, stringArray.length / 2)
                    .noneMatch(i -> !(stringArray[i].equals(stringArray[stringArray.length - i - 1])));
        } else return IntStream.range(0, inputString.length() / 2)
                .noneMatch(i -> inputString.charAt(i) != inputString.charAt(inputString.length() - i - 1));
    }

    //  you can also use string builders like:
    //  else return new StringBuilder(inputString).reverse().toString().equals(inputString);
}
