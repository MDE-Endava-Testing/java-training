package homeworks.douglas.secondAssigment;

/**
 * This Class G connects with methodD
 */

public class ClassG extends MainClass implements InterfaceDE {

    private boolean f;


    public void methodA() {
        System.out.println("methodA with unique behaviour");
    }

    @Override
    public void methodD() {
        System.out.println("This is methodD with ClassG");
    }

    @Override
    public void methodE() {
        System.out.println("methodE with unique behaviour");
    }
}
