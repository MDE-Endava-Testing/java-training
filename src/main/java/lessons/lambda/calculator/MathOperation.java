package lessons.lambda.calculator;

@FunctionalInterface
public interface MathOperation {
    int operate(int a, int b);
}
