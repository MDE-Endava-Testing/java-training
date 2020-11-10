package lessons.lambda.javasam.supplier;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        String somethingThatICantHandle = "fdsfsdfs";
        int unknown = 43123241;

        Supplier<Double> random = () -> Math.random();
        String a = random.get().toString();
        Consumer<String> printer = s -> System.out.println();

        printer.accept(a);
    }
}
