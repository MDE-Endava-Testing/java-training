package homeworks.douglas.secondAssigment;

import java.util.List;

/**
 * This Class E connects with methodD and methodE
 */

public class ClassE implements InterfaceDE {

    private int h;
    private List<String> c;

    @Override
    public void methodD() {
        System.out.println("methodD with unique behaviour");
    }

    @Override
    public void methodE() {
        System.out.println("This is methodE with ClassE");
    }
}
