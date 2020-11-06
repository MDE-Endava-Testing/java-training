package homeworks.jose.firstAssigment.HerenciaInterface;

public class MainFigures {

    /**
     * Main method, create two figures and set the base, height and name,
     * after that it shows the figures
     * @param args
     */
    public static void main(String [] args){
        Triangle t1 = new Triangle();
        Square s1 = new Square();

        t1.setBase(4);
        t1.setHeight(4);
        t1.setName("First Triangle");

        s1.setBase(5);
        s1.setHeight(3);
        s1.setName("First Square");

        t1.showName();
        t1.showDimension();
        System.out.println("The area for "+t1.getName()+" is "+t1.area());
        t1.draw();

        s1.showName();
        s1.showDimension();
        System.out.println("The area for "+s1.getName()+" is "+s1.area());
        s1.draw();
    }
}
