package lessons.lambda.javasam.consumer;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {

//    public static void main(String[] args) {
//
//        Consumer<String> printer = s -> System.out.println(s.toUpperCase());
//        printer.accept("Java Training");
//        printer.accept("try");
//
//    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Christian");
        list.add("Andrea");
        list.add("Alejo");
        list.add("Jose");
        list.add("Douglass");
        list.add("Daniel");
        list.add("JuanPa");

        Consumer<String> print = s -> System.out.println(s.toUpperCase());

        list.forEach(print);
        list.forEach(s -> System.out.println(s.toUpperCase()));
    }
}
