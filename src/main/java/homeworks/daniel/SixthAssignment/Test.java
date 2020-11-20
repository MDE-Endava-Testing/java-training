package homeworks.daniel.SixthAssignment;

public class Test {
    /**
     * Main method to test different inputs
     * @param args
     */
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        System.out.println(calculator1.calculate("5 + 2 - 3 * 7 + 2 / 3"));
        System.out.println(calculator1.calculate("10 / 2 * 3 - 3 / 3 * 5"));
        System.out.println(calculator1.calculate("9 * 9 - 1 * 7 / 8 + 30"));
        System.out.println(calculator1.calculate("2^3"));
        calculator1.addNewOp('^',(a,b)->Math.pow(a,b));
        System.out.println(calculator1.calculate("2^3"));
        System.out.println(calculator1.calculate("12*10+"));
        System.out.println(calculator1.calculate("12*+10"));
        System.out.println(calculator1.calculate("+12*10"));
        System.out.println(calculator1.calculate("++++++1+12+2++++"));
        System.out.println(calculator1.calculate("1/3"));
        System.out.println(calculator1.calculate("12++33++--1--2"));
    }
}
