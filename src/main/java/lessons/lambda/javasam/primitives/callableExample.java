package lessons.lambda.javasam.primitives;

import java.util.concurrent.Callable;
import java.util.function.Supplier;

public class callableExample {

    public static void main(String[] args)  throws Exception{
        Supplier<Double> r1 = ()-> Math.random();
        Callable<Double> r2 = ()-> Math.random();
        exampleofCallable(r2);

    }


    public static void exampleofCallable(Callable<Double> call){

    }


}
