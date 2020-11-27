package lessons.lambda.javasam.primitives;

import com.google.common.util.concurrent.Uninterruptibles;

import java.util.concurrent.TimeUnit;

public class runnableExample {


    public static void main(String[] args) {
        Runnable r = ()-> {
            Uninterruptibles.sleepUninterruptibly(5, TimeUnit.SECONDS);
            System.out.println("Hello World");
        };

        new Thread(r).start();

        System.out.println("before");

    }
}
