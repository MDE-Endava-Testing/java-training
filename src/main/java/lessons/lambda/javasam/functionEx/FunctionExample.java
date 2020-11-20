package lessons.lambda.javasam.functionEx;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionExample {

//    public static void main(String[] args) {
//        Function<String, Integer> strLenght = s-> s.length();
//        Function<Integer, Integer> square = i->i*i;
//
//        System.out.println(
//               //int .andThen //int                           //string
//                square.compose(strLenght).apply("Juan pablo Campos")
//
//        );
////        System.out.println(square.apply(10));
//    }

    public static void main2(String[] args) {
        Function<Integer, Integer> plusTwo = i->i+2;
        Function<Integer, Integer> square = i->i*i;

        //AndThen a->b
        //Compose b->a

        System.out.println(
                plusTwo.compose(square).apply(8)
        );
    }

    //Chaining Example
    public static void main(String[] args) {
        Consumer<String> c1 = s-> System.out.println(s.toUpperCase());
        Consumer<String> c3 = s-> System.out.println(s.trim());
        Consumer<String> c2 = s-> System.out.println(s.toLowerCase());

        c1.andThen(c2).andThen(c3).accept("El mono si participa");

        Function<Integer, Integer> plusTwo = i->i+2;
        Function<Integer, Integer> square = i->i*i;

        System.out.println(
                plusTwo.andThen(square).apply(8)
        );
    }
}
