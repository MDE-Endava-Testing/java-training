package homeworks.juanpa.firstAssigment.composition;

public class Engineer {

    private Tester tester;

    /**
     * create a new role for a tester
     * @param tester
     */
    public Engineer(Tester tester) {
        this.tester = new Tester();
        tester.setRole("Performance Tester");
    }
}
