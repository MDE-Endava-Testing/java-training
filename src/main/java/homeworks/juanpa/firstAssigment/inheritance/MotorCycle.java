package homeworks.juanpa.firstAssigment.inheritance;

public class MotorCycle extends Vehicles {

    private String typeMototBike;
    private String motorType;

    /**
     * MotoCycle constructor
     * @param color
     * @param wheelRim
     * @param numberPassengers
     * @param typeMototBike
     * @param motorType
     */
    public MotorCycle(String color, int wheelRim, int numberPassengers, String typeMototBike, String motorType) {
        super(color, wheelRim, numberPassengers);
        this.typeMototBike = typeMototBike;
        this.motorType = motorType;
    }

    /**
     * Override to turns on the Motorbike
     */
    @Override
    public void turOnVehicle() {
        System.out.println("Motorbike is On");
    }
}
