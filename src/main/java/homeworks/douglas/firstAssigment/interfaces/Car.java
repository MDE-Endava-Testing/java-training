package homeworks.douglas.firstAssigment.interfaces;

/**
 * This method allow to interact with the Interface Wheel
 */

public class Car implements Wheel{
    public Car(){

    }

    @Override
    public void fast(){

        System.out.println("The car going fast!");
    }

    @Override
    public void slow() {

        System.out.println("The car going slow!");
    }
}
