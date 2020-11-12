package homeworks.alejo.thirdAassignment;

public class Eject {
    int cont = 0;

    public static void main(String[] args) {
        //IOperation operation = () -> System.out.println("Wenas las tenga");

        IOperation pureOperation = (n1, n2) -> {
            int result = n1 + n2;
            System.out.println(result);
        };

        IOperation impureOperation = (n1, n2) -> {
            Eject  eject = new Eject();
            eject.cont = eject.cont + n1 + n2;
            System.out.println(eject.cont);
        };

        pureOperation.message(1, 2);
        impureOperation.message(1,2);
        impureOperation.message(1,2);


    }
}
