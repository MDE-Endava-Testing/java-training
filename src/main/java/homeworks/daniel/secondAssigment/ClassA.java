package homeworks.daniel.secondAssigment;

import java.util.List;

public class ClassA extends ClassABC {
    int a;
    String b;
    List c;

    void methodA(){}
    @Override
    void methodB(){System.out.println("ClassA:methodB");}
    @Override
    void methodC(){System.out.println("ClassA:methodC");}
}
