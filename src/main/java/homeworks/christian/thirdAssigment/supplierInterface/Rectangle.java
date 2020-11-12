package homeworks.christian.thirdAssigment.supplierInterface;

public class Rectangle extends Figure {

    private int lado1;
    private int lado2;

    /**
     * Constructor method with params
     * @param lado1
     * @param lado2
     */
    public Rectangle(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    /**
     * Constructor method without params
     */
    public Rectangle() {
        this(2,2);
    }

    /**
     * method get lado1
     * @return lado1
     */
    public int getLado1() {
        return lado1;
    }

    /**
     * method set lado1
     * @param lado1
     */
    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    /**
     * method get lado2
     * @return lado2
     */
    public int getLado2() {
        return lado2;
    }

    /**
     * method set lado2
     * @param lado2
     */
    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    /**
     * method override area
     * @return the form with the params get
     */
    @Override
    public double area() {
        return this.lado1*this.lado2;
    }
}
