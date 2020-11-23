package homeworks.alejo.sixthAssignment;


import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;


public class CalculatorBiFunctions {

    private static final BiFunction<Integer, Integer, Integer> adding = (a, b) -> a + b;

    private static final BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;

    private static final BiFunction<Integer, Integer, Integer> multiplication = (a, b) -> a * b;

    private static final BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;

    private static final Map<Character, BiFunction<Integer, Integer, Integer>> MAP = new HashMap<>();

    static {
        MAP.put('+', adding);
        MAP.put('-', subtraction);
        MAP.put('*', multiplication);
        MAP.put('/', division);
    }

    public static int getOperation(char operation, int a, int b) {
        return MAP.get(operation).apply(a, b);
    }
}
