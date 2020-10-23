package homeworks.douglas.firstAssigment.interfaces;

/**
 * This method allow to interact with the Interface Wheel
 */

public class Bike implements Wheel{

    public Bike(){

    }

    @Override
    public void fast(){

        System.out.println("The Bike going fast!");
    }

    @Override
    public void slow() {
        System.out.println("The bike going slow!");
    }
}
