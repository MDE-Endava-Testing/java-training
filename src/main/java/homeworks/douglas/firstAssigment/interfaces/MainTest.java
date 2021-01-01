package homeworks.douglas.firstAssigment.interfaces;

public class MainTest {

    /**
     * This method connects the interface Wheel with Car and Bike
     */

    public static void main(String[] args){
        Car c = new Car();
        Bike b = new Bike();

        c.fast();
        b.slow();
    }
}
