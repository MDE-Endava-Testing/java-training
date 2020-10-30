package homeworks.alejo.secondAssignment;

import java.util.List;

public class ClassA extends ParentClassABDG {

    private List<Integer> c;

    @Override
    public void methodB() {
        System.out.println("Altered behavior methodB from classA");
    }

    @Override
    public void methodC() {
        System.out.println("Altered behavior methodC from classA");
    }

}
