package homeworks.andrea.thirdAssignment;

@FunctionalInterface
public interface Calculation {

    /**
     * This is a single abstract interface (SAM) that contains an abstract method used for calculation purposes.
     * The abstract method receives two double parameters and input and returns a double as ouput.
     */

    /**
     * Calculation between two values
     *
     * @param a corresponds to a number or value which can be used to execute a calculation
     * @param b corresponds to a second number or value which can be used to execute a calculation
     * @return the output obtained after implementing a calculation between the input values
     */
    double calculate(double a, double b);
}
