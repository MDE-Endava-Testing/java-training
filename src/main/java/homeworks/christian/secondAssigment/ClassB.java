package homeworks.christian.secondAssigment;

import java.util.HashSet;

public class ClassB extends ParentABD{

    private HashSet e = new HashSet();

    /**
     * this method is empty and is a override
     */
    @Override
    public void MethodB() {
        super.MethodB();
    }

    /**
     * method get e
     * @return e
     */
    public HashSet getE() {
        return e;
    }

    /**
     * method set e
     * @param e
     */
    public void setE(HashSet e) {
        this.e = e;
    }
}
