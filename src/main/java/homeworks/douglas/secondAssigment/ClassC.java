package homeworks.douglas.secondAssigment;

/**
 * This Class C connects with methodD and methodE
 */

public class ClassC extends MainClass implements InterfaceDE {

    private boolean f;
    private String i;

    @Override
    public void methodD(){
        System.out.println("methoD with unique behaviour");
    }

    @Override
    public void methodE(){
        System.out.println("This is methodE with ClassC");
    }
}
