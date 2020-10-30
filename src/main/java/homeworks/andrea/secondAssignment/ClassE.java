package homeworks.andrea.secondAssignment;

import java.util.List;

public class ClassE implements InterfaceDE {

    private int h;
    private List<String> c;

    @Override
    public void methodD() {
        System.out.println("I'm the unique method D on class E");
    }

    @Override
    public void methodE() {
        System.out.println("I'm the generic method E on class E");
    }
}
