package homeworks.juanpa.firstAssigment.inheritance;

public class Car extends Vehicles{

    private int numberDoors;
    private int horsepower;
    private String gasType;

    public Car(String color, int wheelRim, int numberPassengers, int numberDoors, int horsepower, String gasType) {
        super(color, wheelRim, numberPassengers);
        this.numberDoors = numberDoors;
        this.horsepower = horsepower;
        this.gasType = gasType;
    }

    @Override
    public void turOnVehicle() {
        System.out.println("the Car is On");
    }
}
