package homeworks.christian.firstAssigment.secondAssigment;

import java.util.HashMap;
import java.util.HashSet;

public class ClassD extends ParentABD{

    private HashMap d = new HashMap();

    /**
     * this method is empty and is a override
     */
    @Override
    public void MethodC() {
        super.MethodC();
    }

    /**
     * method get d
     * @return d
     */
    public HashMap getD() {
        return d;
    }

    /**
     * method set d
     * @param d
     */
    public void setD(HashMap d) {
        this.d = d;
    }
}
