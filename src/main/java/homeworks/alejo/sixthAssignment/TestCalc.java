package homeworks.alejo.sixthAssignment;

public class TestCalc {

    static Validator validator = new Validator();

    public static void main(String[] args) {

        String operation = "5 + 6 - 6 * 8 / 10";
        if (!validator.validateOperator(operation)) {
            System.out.println("Wrong Input");
        } else {
            System.out.println(Calculator.calculate(operation));
        }
    }
}
