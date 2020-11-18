package homeworks.christian.secondAssigment;

import java.util.ArrayList;
import java.util.List;

public class ClassE implements InterfaceCEG {

    private int h;
    private List<Integer> c = new ArrayList<Integer>();

    /**
     * this method is empty and is a override
     */
    @Override
    public void methodD() {

    }

    /**
     * this method is empty and is a override
     */
    @Override
    public void methodE() {

    }

    /**
     * method get h
     * @return h
     */
    public int getH() {
        return h;
    }

    /**
     * method set h
     * @param h
     */
    public void setH(int h) {
        this.h = h;
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
