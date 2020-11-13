package homeworks.juanpa.secondAssigment;

import java.util.List;

public class ClassA extends ClassG{

    List c;

    /**
     * Create a unique behavior in A to methodB
     */
    @Override
    public void methodB() {
        System.out.println("unique behavior in A");
    }

    /**
     * Create a unique behavior in A to methodC
     */
    @Override
    public void methodC() {
        System.out.println("unique behavior in A");
    }
}
