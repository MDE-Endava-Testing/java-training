package inheritanceExercise;

public class Tablet extends Devices {
    /**
     * Turns on tablet
     */
    @Override
    public void turnOn() {
        System.out.println("Turning tablet on");
    }
    /**
     * Turns off tablet
     */
    @Override
    public void turnOff() {
        System.out.println("Turning tablet off");
    }

}
