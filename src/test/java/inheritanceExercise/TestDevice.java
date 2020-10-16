package inheritanceExercise;

public class TestDevice {
    public static void main(String[] args) {
    testDevice(new PC());
    testDevice(new SmartPhone());
    testDevice(new Tablet());

    }
    private static void testDevice(Devices myDevice){
        myDevice.turnOn();
        myDevice.openWebBrowser();
        myDevice.turnOff();
    }
}
