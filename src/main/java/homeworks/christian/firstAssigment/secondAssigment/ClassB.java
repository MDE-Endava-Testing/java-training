package homeworks.christian.firstAssigment.secondAssigment;

import java.util.HashSet;

public class ClassB extends ClassA{

    HashSet e = new HashSet();

    @Override
    public void methodC() {
        super.methodC();
        System.out.println("method general C in B");
    }

    public HashSet getE() {
        return e;
    }

    public void setE(HashSet e) {
        this.e = e;
    }
}
