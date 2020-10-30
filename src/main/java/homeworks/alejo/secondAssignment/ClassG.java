package homeworks.alejo.secondAssignment;

public class ClassG extends ParentClassABDG implements InterfaceCEG {

    private boolean f;

    @Override
    public void methodA() {
        System.out.println("Altered behavior methodA from classG");
    }

    @Override
    public void methodD() {
        System.out.println("Altered behavior methodD from classG");
    }

    @Override
    public void methodE() {
        System.out.println("Altered behavior methodE from classG");
    }
}
