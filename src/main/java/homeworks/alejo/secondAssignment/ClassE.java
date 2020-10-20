package homeworks.alejo.secondAssignment;

import java.util.List;

public class ClassE implements InterfaceCEG{
    private int h;
    private List<Integer> c;


    @Override
    public void methodD() {
        System.out.println("Altered behavior methodD from classE");
    }

    @Override
    public void methodE() {
        System.out.println("Altered behavior methodE from classE");
    }
}
