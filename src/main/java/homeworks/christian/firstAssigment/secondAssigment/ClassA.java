package homeworks.christian.firstAssigment.secondAssigment;

import java.util.ArrayList;
import java.util.List;

public class ClassA extends ParentABD{

    private List<Integer> c = new ArrayList<Integer>();

    /**
     * this method is empty and is a override
     */
    @Override
    public void MethodB() {
        super.MethodB();
    }

    /**
     * this method is empty and is a override
     */
    @Override
    public void MethodC() {
        super.MethodC();
    }

    /**
     * method get c
     * @return c
     */
    public List<Integer> getC() {
        return c;
    }

    /**
     * method set c
     * @param c
     */
    public void setC(List<Integer> c) {
        this.c = c;
    }

}
