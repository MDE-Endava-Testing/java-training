package homeworks.andrea.thirdAssignment;

/**
 * This class contains the implementation of pure and not pure lambdas, in order to validate the behavior of Calculation SAM interface and to understand the basic concepts of
 * direct/not direct lambdas
 */

public class TestCalculation {

    // External variable that corresponds to a counter
    private int count = 0;

    /**
     * This is the main method of TestCalculation class. Here the implementation of different lambdas is done.
     * There are three implemented lambdas: two of them correspond to pure lambda examples and one corresponds to a not pure lambda example.
     * Finally, some uses of the lambda are displayed in order to validate its functionality.
     */
    public void main(String[] args) {

        double number1 = 5;
        double number2 = 3.5;
        double number3 = 4;

        /*Pure lambdas
        The return-output of both lambdas depend only on input parameters (number1 and number2)
        The lambas don't modify the state/value of any variable outside the function anywhere*/
        Calculation rectangleArea = (side1, side2) -> side1 * side2;
        Calculation triangleArea = (base, height) -> (base * height) / 2;

        /*Not pure lambda
        Uses external variables to calculate its return value (number3)
        Modifies the value/state of an external variable (count)*/
        Calculation average = (numb1, numb2) -> {
            this.count++;
            return (numb1 + numb2 + number3) / 3;
        };

        //Tests
        System.out.println(rectangleArea.calculate(number1, number2));
        System.out.println(triangleArea.calculate(number1, number2));
        System.out.println(average.calculate(number1, number2));
    }
}
