package lessons.assigments.lambdacalculator;

public class testOperator {

    public static void main(String[] args) {
        calcExecutor("5 + 2 - 3 * 7 + 2 / 3"); //10
        calcExecutor("10 / 2 * 3 - 3 / 3 * 5"); //20
        calcExecutor("9 * 9 - 1 * 7 / 8 + 30"); //100

//        Operator.addOperation("%", (a,b)-> a%b);
//        BiFunction<Integer, Integer, Integer> pow = (a,b)-> (int) Math.pow((int)a,(int)b);
//        Operator.addOperation("^", pow);
//        calcExecutor("9 * 9 - 1 * 7 / 8 + 30 ^ 2 % 3"); //1

    }

    public static void calcExecutor(String input) {
        String[] digits = input.split(" ");
        int result = Integer.parseInt(digits[0]);
        for (int i = 1; i < digits.length; i = i + 2) {
            result = Operator.getOperation(result, digits[i], Integer.parseInt(digits[i + 1]));
        }
        System.out.println(result);
    }


}
