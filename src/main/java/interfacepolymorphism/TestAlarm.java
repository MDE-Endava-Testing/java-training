package interfacepolymorphism;

public class TestAlarm {

    public static void main(String[] args) {
        Clock c = new Clock();
        test(c);
    }

    private static void test(Alarm a){
        a.setAlarm();
    }
}
