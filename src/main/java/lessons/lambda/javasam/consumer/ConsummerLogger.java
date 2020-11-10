package lessons.lambda.javasam.consumer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class ConsummerLogger {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("first process");
        list.add("second process");
        list.add("third process");
        list.add("fourth process");

        Consumer<String> dbConsumer = s -> System.out.println("Writing into DB ::" + s);

        Consumer<String> logConsumer = s -> System.out.println("Writing into log ::" + s);

        Consumer<String> both = logConsumer.andThen(dbConsumer);

        //   Method1(method2(Method3()))
        //   Lambda1().Lambda2().Lambda3()

        //Chaining .andThen

//        list.forEach(dbConsumer);
//        list.forEach(logConsumer);

        //with parametrized external properties
        Map<String, Consumer<String>> map = new HashMap<>();
        map.put("db", dbConsumer);
        map.put("log", logConsumer);
        map.put("both", both);

        list.forEach(map.get(System.getProperty("Consumer-Type")));
    }

}
