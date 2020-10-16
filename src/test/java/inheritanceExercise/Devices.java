package inheritanceExercise;

/**
 *Electronic Devices
 */
public abstract class Devices {
    private int resHeight;
    private int resWidth;
    private String operatingSystem;

    /**
     * Powers the device
     */
    public abstract void turnOn();
    /**
     * switch off the device
     */
    public abstract void turnOff();
    /**
     * opens web browser
     */
    public void openWebBrowser(){System.out.println("opening Google Chrome");}
}
