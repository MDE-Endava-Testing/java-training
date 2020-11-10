package lessons.lambda.javasam.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {

        BiConsumer<String, Integer> biConsumer = (n,h)->{
            System.out.println("Name :: " + n);
            System.out.println("Homeworks :: "+ h+"\n");
        };

        biConsumer.accept("Juan", 5);
        biConsumer.accept("Andrea", 4);

    }

}
