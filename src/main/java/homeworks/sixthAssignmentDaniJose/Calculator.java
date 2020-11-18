package homeworks.sixthAssignmentDaniJose;

import java.util.*;
import java.util.function.Function;
import java.util.function.IntBinaryOperator;
import java.util.function.Predicate;

public class Calculator {

    private static final Map<String, IntBinaryOperator> map = new HashMap<>();

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        map.put("+", (v1, v2) -> v1 + v2);
        map.put("-", (v1, v2) -> v1 - v2);
        map.put("*", (v1, v2) -> v1 * v2);
        map.put("/", (v1, v2) -> v1 / v2);

        String operation = "5 + 2 - 3 * 7 + 2 / 3";
        String operation1 = "10 / 2 * 3 - 3 / 3 * 5";
        String operation2 = "9 * 9 - 1 * 7 / 8 + 30";

        List<String> operationArray = Arrays.asList(operation.split(" "));
        List<String> operationArray1 = Arrays.asList(operation1.split(" "));
        List<String> operationArray2 = Arrays.asList(operation2.split(" "));

        System.out.println(calculatorCode(operationArray));
        System.out.println(calculatorCode(operationArray1));
        System.out.println(calculatorCode(operationArray2));
    }

    /**
     *
     * @param operation
     * @return
     */
    private static int calculatorCode(List<String> operation) {
        int result = 0;
        for (int i = 0; i + 2 < operation.size(); i = i + 2) {
            String firstNumber, operator, secondNumber;
            if (i == 0) {
                firstNumber = operation.get(i);
                operator = operation.get(i + 1);
                secondNumber = operation.get(i + 2);
                if (isNumeric1.test(firstNumber) && isNumeric1.test(secondNumber)) {
                    result = map.get(operator).applyAsInt(Integer.parseInt(firstNumber), Integer.parseInt(secondNumber));
                } else {
                    System.out.println("The expression is invalid");
                    result = -1;
                    break;
                }
            } else {
                operator = operation.get(i + 1);
                secondNumber = operation.get(i + 2);
                if (isNumeric.apply(secondNumber)) {
                    result = map.get(operator).applyAsInt(result, Integer.parseInt(secondNumber));
                } else {
                    System.out.println("The expression is invalid");
                    result = -1;
                    break;
                }
            }
        }
        return result;
    }

    /**
     *
     */
    static Function<String, Boolean> isNumeric =
            (string) -> {
                try {
                    Integer.parseInt(string);
                    return true;
                } catch (NumberFormatException nfe) {
                    return false;
                }
            };

    /**
     * 
     */
    static Predicate<String> isNumeric1 =
            (string) -> {
                try {
                    Integer.parseInt(string);
                    return true;
                } catch (NumberFormatException nfe) {
                    return false;
                }
            };
}
