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

    public int getRadio() {
        return radio;
    }

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
