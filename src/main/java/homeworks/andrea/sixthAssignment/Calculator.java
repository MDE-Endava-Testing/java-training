package homeworks.andrea.sixthAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * Simulation of a calculator with some basic operators such as add, substract, multiply and divide.
 * A math expression is received, converted and processed in order to return its math result.
 */
public class Calculator {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> operators = new HashMap<>();

    static {
        operators.put("+", (a, b) -> a + b);
        operators.put("-", (a, b) -> a - b);
        operators.put("*", (a, b) -> a * b);
        operators.put("/", (a, b) -> a / b);
    }

    private Function<String, Integer> parseInt = Integer::parseInt;

    private int implementOperator(int firstNumber, int secondNumber, String mathOperator) {
        return operators.get(mathOperator).apply(firstNumber, secondNumber);
    }

    /**
     * Given a math expression as String, apply the math operations inside it and return its result.
     *
     * @param expression corresponds to the math expression that will be processed.
     * @return the result of the math operation
     */
    public int calculate(String expression) {
        int result = 0, firstNumber, secondNumber;
        String mathOperation;

        //split
        String[] convertedExpression = expression.split(" ");

        //calculate
        for (int i = 0; i + 2 < convertedExpression.length; i++) {
            if (i == 0) {
                firstNumber = parseInt.apply(convertedExpression[i]);
                mathOperation = convertedExpression[i + 1];
                secondNumber = parseInt.apply(convertedExpression[i + 2]);
                result = implementOperator(firstNumber, secondNumber, mathOperation);
            } else {
                firstNumber = result;
                mathOperation = convertedExpression[i + 2];
                secondNumber = parseInt.apply(convertedExpression[i + 3]);
                result = implementOperator(firstNumber, secondNumber, mathOperation);
                i++;
            }
        }
        return result;
    }
}
