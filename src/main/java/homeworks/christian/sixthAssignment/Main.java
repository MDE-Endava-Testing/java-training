package homeworks.christian.sixthAssignment;

/**
 * Main class, where write the diferents expresions for to do
 */
public class Main {

    public static void main(String[] args){
        Calculator calculate = new Calculator();
        String expresion1 = "5 + 2 - 3 * 7 + 2 / 3";
        String expresion2 = "10 / 2 * 3 - 3 / 3 * 5";
        String expresion3 = "9 * 9 - 1 * 7 / 8 + 30";

        //Result = 10
        System.out.println(calculate.calculate(expresion1));
    }
}
