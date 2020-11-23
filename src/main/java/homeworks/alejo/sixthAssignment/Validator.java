package homeworks.alejo.sixthAssignment;


public class Validator {

    private boolean rightExpression(String operation) {
        return operation.matches("[\\d+*/\\- ]*");

    }

    public boolean validateOperator(String operator) {
        return rightExpression(operator);
    }
}
