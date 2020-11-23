package homeworks.alejo.sixthAssignment;

import java.util.HashMap;
import java.util.Map;


public class Calculator {

    private static final MathOperator adding = (a, b) -> a + b;
    private static final MathOperator subtraction = (a, b) -> a - b;
    private static final MathOperator multiplication = (a, b) -> a * b;
    private static final MathOperator division = (a, b) -> a / b;

    private static final Map<String, MathOperator> MAP = new HashMap<>();

    static {
        MAP.put("+", adding);
        MAP.put("-", subtraction);
        MAP.put("*", multiplication);
        MAP.put("/", division);
    }

    public static int calculate(String operation) {
        String[] expression = operation.split(" ");
        int cont = 0;
        int rigthNumber;
        int leftNumber = Integer.parseInt(expression[0]);
        for (String a : expression) {
            if (a.matches("[+*/()\\-]*")) {
                rigthNumber = Integer.parseInt(expression[cont + 1]);
                leftNumber = MAP.get(a).operate(leftNumber, rigthNumber);
            }
            cont++;
        }
        return leftNumber;
    }
}
