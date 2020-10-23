package homeworks.christian.firstAssigment.secondAssigment;

import java.util.ArrayList;
import java.util.List;

public class ClassA implements InterfaceA{

    private int a = 0;
    private String b ="";
    List<Integer> c = new ArrayList<Integer>();

    @Override
    public void methodA() {
        System.out.println("method general A in A");
    }

    @Override
    public void methodB() {
        System.out.println("method unique B in A");
    }

    @Override
    public void methodC() {
        System.out.println("method unique C in A");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public List<Integer> getC() {
        return c;
    }

    public void setC(List<Integer> c) {
        this.c = c;
    }
}
