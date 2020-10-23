package homeworks.christian.firstAssigment.secondAssigment;

public class ClassG extends ClassA implements InterfaceDE{

    private int a;
    private String b;
    private boolean f;

    @Override
    public void methodD() {
        System.out.println("method general D");
    }

    @Override
    public void methodE() {
        System.out.println("method unique E");
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

    public boolean isF() {
        return f;
    }

    public void setF(boolean f) {
        this.f = f;
    }
}
