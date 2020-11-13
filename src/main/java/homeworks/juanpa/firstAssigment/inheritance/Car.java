package homeworks.juanpa.firstAssigment.inheritance;

public class Car extends Vehicles{

    private int numberDoors;
    private int horsepower;
    private String gasType;

    /**
     * constructor to Vehicles
     * @param color
     * @param wheelRim
     * @param numberPassengers
     * @param numberDoors
     * @param horsepower
     * @param gasType
     */
    public Car(String color, int wheelRim, int numberPassengers, int numberDoors, int horsepower, String gasType) {
        super(color, wheelRim, numberPassengers);
        this.numberDoors = numberDoors;
        this.horsepower = horsepower;
        this.gasType = gasType;
    }

    /**
     * Ovveride to turns on the car
     */
    @Override
    public void turOnVehicle() {
        System.out.println("the Car is On");
    }
}
