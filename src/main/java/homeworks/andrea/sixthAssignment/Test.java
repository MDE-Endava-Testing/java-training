package homeworks.andrea.sixthAssignment;

/**
 * Validation of Calculator Class.
 * Check if an int is returned after sending a math expression with string format. Print the result.
 */
public class Test {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        String expression1 = "5 + 2 - 3 * 7 + 2 / 3";
        String expression2 = "10 / 2 * 3 - 3 / 3 * 5";
        String expression3 = "9 * 9 - 1 * 7 / 8 + 30";
        String expression4 = "1000 + 1000";

        System.out.println(calculator.calculate(expression1));
        System.out.println(calculator.calculate(expression2));
        System.out.println(calculator.calculate(expression3));
        System.out.println(calculator.calculate(expression4));
    }
}
