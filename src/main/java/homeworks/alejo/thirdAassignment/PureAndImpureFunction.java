package homeworks.alejo.thirdAassignment;

public class PureAndImpureFunction {
    private int variableFueraDelScopeDeLaFuncion = 0;

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        PureAndImpureFunction pureAndImpureFunction = new PureAndImpureFunction();

        System.out.println("Primera iteracion de suma pura: " + sumaPura(num1, num2));
        System.out.println("Primera iteracion de suma impura: " + pureAndImpureFunction.sumaImpura(num1, num2));

        System.out.println("Segunda iteracion de suma pura: " + sumaPura(num1, num2));
        System.out.println("Segunda iteracion de suma impura: " + pureAndImpureFunction.sumaImpura(num1, num2));

        System.out.println("Tercera iteracion de suma pura: " + sumaPura(num1, num2));
        System.out.println("Tercera iteracion de suma impura: " + pureAndImpureFunction.sumaImpura(num1, num2));


    }

    /**
     * Método que genera la suma de dos números pasados por parametros
     */
    public static int sumaPura(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * Método que genera la suma de dos números suministrados por parametros y ademas guarda esta suma en una variable
     * global
     */
    public int sumaImpura(int num1, int num2) {
        variableFueraDelScopeDeLaFuncion = variableFueraDelScopeDeLaFuncion + num1 + num2;
        return variableFueraDelScopeDeLaFuncion;
    }
}
