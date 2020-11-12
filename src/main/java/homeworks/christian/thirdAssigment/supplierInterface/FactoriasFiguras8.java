package homeworks.christian.thirdAssigment.supplierInterface;

import java.util.HashMap;
import java.util.function.Supplier;

public class FactoriasFiguras8 {

    private static HashMap<String, Supplier<Figure>> mapa= new HashMap<>();

    static {
        mapa.put("rectangulo", Rectangle::new);
        mapa.put("circulo", Circle::new);
    }

    /**
     * method create figure
     * @param tipo
     * @return a new circle or a new rectangle
     */
    public static Figure crearFigura(String tipo) {

        if (mapa.get(tipo)!=null) {

            return mapa.get(tipo).get();
        }else {
            return null;
        }

    }

}
