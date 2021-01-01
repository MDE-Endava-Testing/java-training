package homeworks.douglas.secondAssigment;

/**
 * MainClass to connects with Interface ABC
 */

public abstract class MainClass implements InterfaceABC {
    private int a;
    private String b;

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

    public void methodA(){}
    public void methodB(){}
    public void methodC(){}
    public void methodD(){}
}
