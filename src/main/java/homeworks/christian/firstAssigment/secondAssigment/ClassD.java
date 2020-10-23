package homeworks.christian.firstAssigment.secondAssigment;

import java.util.HashMap;
import java.util.HashSet;

public class ClassD extends ClassA{

    HashMap d = new HashMap();

    @Override
    public void methodB() {
        super.methodB();
        System.out.println("method general B in D");
    }

    public HashMap getD() {
        return d;
    }

    public void setD(HashMap d) {
        this.d = d;
    }
}
