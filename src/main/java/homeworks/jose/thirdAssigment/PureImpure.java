import java.util.*;

@FunctionalInterface
interface Lambda {
    double mult(int name);
}

public class PureImpure {
    public static void main(String[] args) throws Exception {

        Lambda lambdaImpure = (a) -> {
            return a * Math.random();
        };
        Lambda lambdaPure = (a) -> {
            return a * a;
        };
        System.out.println(lambdaImpure.mult(5));
        System.out.println(lambdaPure.mult(5));
    }
}