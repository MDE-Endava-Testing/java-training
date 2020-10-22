package homeworks.juanpa.firstAssigment.composition;

public class Engineer {

    private Tester tester;

    public Engineer(Tester tester) {
        this.tester = new Tester();
        tester.setRole("Performance Tester");
    }
}
