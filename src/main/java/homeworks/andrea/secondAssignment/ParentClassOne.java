package homeworks.andrea.secondAssignment;

public abstract class ParentClassOne implements InterfaceABC {

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

    @Override
    public void methodA() {
        System.out.println("I'm the generic method A of the Parent Class one");
    }

    @Override
    public void methodB() {
        System.out.println("I'm the generic method B  of the Parent Class one");
    }

    @Override
    public void methodC() {
        System.out.println("I'm the generic method C  of the Parent Class one");
    }

}
