package inheritanceExercise;

public class PC extends Devices {
    /**
     * Turns on a personal computer
     */
    @Override
    public void turnOn() {
        System.out.println("Turning PC on");
    }
    /**
     * Turns of a persona computer
     */
    @Override
    public void turnOff() {
        System.out.println("Turning PC off");
    }

}
