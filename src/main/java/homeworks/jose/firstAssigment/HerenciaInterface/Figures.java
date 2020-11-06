package homeworks.jose.firstAssigment.HerenciaInterface;

public abstract class Figures {

    private double base;
    private double height;
    private String name;

    /**
     * Return the base of the figure
     * @return base
     */
    double getBase(){return base;}

    /**
     * Return the height of the figure
     * @return height
     */
    double getHeight(){return height;}

    /**
     * Return the name of the figure
     * @return name
     */
    String getName(){return name;}

    /**
     * Set the base of the figure
     * @param b
     */
    void setBase(double b){base=b;}

    /**
     * Set the height of the figure
     * @param h
     */
    void setHeight(double h){height=h;}

    /**
     * Set the name of the figure
     * @param n
     */
    void setName(String n){name=n;}

    /**
     * Show the dimensions of the figure (Base and Height)
     */
    void showDimension(){
        System.out.println("The base y the height is: "+base+" y "+height);
    }

    /**
     * Show the name of the figure
     */
    void showName(){
        System.out.println("The name of the figure is "+name);
    }
}
