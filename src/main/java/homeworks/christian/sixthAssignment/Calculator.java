package homeworks.christian.sixthAssignment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

/**
 * class calculator, where get the expresion and
 * then the calculation will be done
 */
public class Calculator {

    private static final Map<String, BiFunction<Integer, Integer, Integer>> function = new HashMap<>();

    static {
        function.put("+", (a, b) -> a + b);
        function.put("-", (a, b) -> a - b);
        function.put("*", (a, b) -> a * b);
        function.put("/", (a, b) -> a / b);
    }

    /**
     * Here, a new list "Expresion" is created to start doing the calculations one by one
     * @param expresion1
     * @return result
     */
    public int calculate(String expresion1) {
        int firstNumber = 0;
        int secondNumber = 0;
        int result = 0;
        String operator = "";

        ArrayList expresion = new ArrayList();
        expresion.add(expresion1.split(" "));
        //String[] expression = expression1.split(" ");

        for (int i = 0; i + 2 < expresion.size(); i++) {
            if (i == 0) {
                firstNumber = (int) expresion.get(i);
                operator = (String) expresion.get(i + 1);
                secondNumber = (int) expresion.get(i + 2);
                result = function.get(operator).apply(firstNumber, secondNumber);
            } else {
                firstNumber = result;
                operator = (String) expresion.get(i + 2);
                secondNumber = (int) expresion.get(i + 3);
                result = function.get(operator).apply(firstNumber, secondNumber);
                i++;
            }
        }
        return result;
    }
}
