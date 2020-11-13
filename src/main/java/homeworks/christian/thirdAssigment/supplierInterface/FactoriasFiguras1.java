package homeworks.christian.thirdAssigment.supplierInterface;

public class FactoriasFiguras1 {

    /**
     * method createFugire
     * @param tipo
     * @return new circle or new rectangle
     */
    public static Figure crearFigura(String tipo){
        if (tipo.equals("Rectangle")) {
            return new Rectangle();
        }else {
            return new Circle();
        }
    }
}
