package homeworks.daniel.firstAssigment.inheritanceExercise;

public class SmartPhone extends Devices {
    /**
     * Turns on smartphone
     */
    @Override
    public void turnOn() {
        System.out.println("Turning phone on");
    }
    /**
     * Turns off smartphone
     */
    @Override
    public void turnOff() {
        System.out.println("Turning phone off");
    }
}
