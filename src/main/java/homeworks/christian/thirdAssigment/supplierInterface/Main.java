package homeworks.christian.thirdAssigment.supplierInterface;

public class Main {

    /**
     * method Main
     * @param args
     */
    public static void main(String[] args) {

        Figure f = FactoriasFiguras1.crearFigura("Rectangle");

        System.out.println(f.area());
    }

}
