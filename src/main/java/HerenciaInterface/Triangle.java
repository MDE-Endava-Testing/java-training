package HerenciaInterface;

public class Triangle extends Figures implements Drawable{

    public double area(){
        return getBase()*getHeight()/2;
    }

    public void draw() {
        System.out.println("drawing triangle");
    }
}
