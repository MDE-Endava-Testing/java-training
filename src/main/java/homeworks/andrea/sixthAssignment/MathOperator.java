package homeworks.andrea.sixthAssignment;

/**
 * Functional interface that allows to calculate an operation between two numbers
 * @see Calculator
 */
@FunctionalInterface
public interface MathOperator {
    int operator(int a, int b);
}
