package homeworks.christian.firstAssigment.secondAssigment;

import java.util.ArrayList;
import java.util.List;

public class ClassE extends ClassC{

    private int h;
    List<Integer> c = new ArrayList<Integer>();

    @Override
    public void methodD() {
        super.methodD();
        System.out.println("method unique D in E");
    }

    @Override
    public void methodE() {
        super.methodE();
        System.out.println("method general E in E");
    }
}
