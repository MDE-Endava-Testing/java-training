package homeworks.jose.firstAssigment.HerenciaInterface;

public class Square extends Figures implements Drawable {

    public double area(){
        return getBase()*getHeight();
    }

    public void draw() {
        System.out.println("drawing square");
    }
}
