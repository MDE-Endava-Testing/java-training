package homeworks.juanpa.firstAssigment.inheritance;

public class Truck extends Vehicles {

    private int chargeType;
    private int dimensions;

    /**
     * Truck Constructor
     * @param color
     * @param wheelRim
     * @param numberPassengers
     * @param chargeType
     * @param dimensions
     */
    public Truck(String color, int wheelRim, int numberPassengers, int chargeType, int dimensions) {
        super(color, wheelRim, numberPassengers);
        this.chargeType = chargeType;
        this.dimensions = dimensions;
    }

    /**
     * Override to turns on the Truck
     */
    @Override
    public void turOnVehicle() {
        System.out.println("the Truck is on");
    }
}
