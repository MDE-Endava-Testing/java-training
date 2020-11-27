package lessons.assigments.lambdacalculator;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Operator {

    private static BiFunction<Integer, Integer, Integer> addition = (a, b) -> a + b;

    private static final Map<String, BiFunction<Integer, Integer, Integer>> mapOperations = new HashMap<>();

    static {
        mapOperations.put("+", addition);
        mapOperations.put("-", (a, b) -> a - b);
        mapOperations.put("*", (a, b) -> a * b);
        mapOperations.put("/", (a, b) -> a / b);
    }

    public static void addOperation(String key, BiFunction<Integer, Integer, Integer> operation) {
        mapOperations.put(key, operation);
    }

    public static int getOperation(int a, String operation, int b) {
        return mapOperations.get(operation).apply(a, b);
    }
}
