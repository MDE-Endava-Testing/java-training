package homeworks.christian.thirdAssigment.supplierInterface;

public class Circle extends Figure {

    private int radio;

    /**
     * constructor method circle with param
     * @param radio
     */
    public Circle(int radio) {
        this.radio = radio;
    }

    /**
     * constructor method circle without param
     */
    public Circle() {
        this(2);
    }

    /**
     * method get
     * @return
     */
    public int getRadio() {
        return radio;
    }

    /**
     * method set radio
     * @param radio
     */
    public void setRadio(int radio) {
        this.radio = radio;
    }

    /**
     * method area with override
     * @return
     */
    @Override
    public double area() {
        return 2*Math.PI*radio;
    }
}
