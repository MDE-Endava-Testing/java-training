package homeworks.jose.firstAssigment.HerenciaInterface;

public abstract class Figures {

    private double base;
    private double height;
    private String name;

    //Get and Set of base and height
    double getBase(){return base;}
    double getHeight(){return height;}
    String getName(){return name;}
    void setBase(double b){base=b;}
    void setHeight(double h){height=h;}
    void setName(String n){name=n;}

    void showDimension(){
        System.out.println("The base y the height is: "+base+" y "+height);
    }

    void showName(){
        System.out.println("The name of the figure is "+name);
    }
}
