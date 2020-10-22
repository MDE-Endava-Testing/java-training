package homeworks.juanpa.firstAssigment.inheritance;

public class Vehicles {

    private String color;
    private int wheelRim;
    private int numberPassengers;

    public Vehicles(String color, int wheelRim, int numberPassengers) {
        this.color = color;
        this.wheelRim = wheelRim;
        this.numberPassengers = numberPassengers;
    }

    /**
     * Turn on vehicle
     */
    public void turOnVehicle(){
        System.out.println("the vehicle is On");
    }

}
