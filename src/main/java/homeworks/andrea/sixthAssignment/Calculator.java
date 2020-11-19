package homeworks.andrea.sixthAssignment;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * Simulation of a calculator with some basic operators such as add, substract, multiply and divide.
 * A math expression is received, converted and processed in order to return its math result.
 */
public class Calculator {

    private static final Map<String, MathOperator> operators = new HashMap<>();
    private static final MathOperator add = (a, b) -> a + b;
    private static final MathOperator substract = (a, b) -> a - b;
    private static final MathOperator multiply = (a, b) -> a * b;
    private static final MathOperator divide = (a, b) -> a / b;

    static {
        operators.put("+", add);
        operators.put("-", substract);
        operators.put("*", multiply);
        operators.put("/", divide);
    }

    private Function<String, Integer> parseInt = Integer::parseInt;

    private int implementOperator(int firstNumber, int secondNumber, String mathOperator) {
        return operators.get(mathOperator).operator(firstNumber, secondNumber);
    }

    /**
     * Given a math expression as String, apply the math operations inside it and return its result.
     *
     * @param expression corresponds to the math expression that will be processed.
     * @return the result of the math operation
     */
    public int calculate(String expression) {
        int result = 0;
        String firstNumber, secondNumber, mathOperation;

        //split
        String[] convertedExpression = expression.split(" ");

        //calculate
        for (int i = 0; i + 2 < convertedExpression.length; i++) {
            if (i == 0) {
                firstNumber = convertedExpression[i];
                mathOperation = convertedExpression[i + 1];
                secondNumber = convertedExpression[i + 2];
                result = implementOperator(parseInt.apply(firstNumber), parseInt.apply(secondNumber), mathOperation);
            } else {
                firstNumber = String.valueOf(result);
                mathOperation = convertedExpression[i + 2];
                secondNumber = convertedExpression[i + 3];
                result = implementOperator(parseInt.apply(firstNumber), parseInt.apply(secondNumber), mathOperation);
                i++;
            }
        }
        return result;
    }
}
