package lessons.lambda;

import lessons.lambda.saminterfaces.StringOperations;

import java.util.ArrayList;
import java.util.List;

public class ExecutingOrder {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Juanpa");
        lista.add("alejo");
        lista.add("Douglas");
        lista.add("Cristian");


        lista.forEach(String::toUpperCase);


//        for (String s : lista) {
//            System.out.println(s);
//        }

//        for (int i = 0; i < lista.size(); i++) {
//            System.out.println(lista.get(i));
//        }


//        System.out.println("Starting Execution");
//        firstMethod(secondMethod());
//        System.out.println("Ending Execution");

//        test(s -> {
//            System.out.println("Inside Lambda");
//            return s.toUpperCase();
//        });
//
//        test(s -> {
//            System.out.println("Inside Lambda");
//            System.out.println("another thing");
//            return s.toLowerCase();
//        });

    }

    private static void firstMethod(String secondMethod) {
        System.out.println("Running First method");
        System.out.println("String recieved is:\n\t" + secondMethod);
    }

    private static String secondMethod() {
        System.out.println("Running Second Method");
        return "Second Method Finished";
    }

    private static void test(StringOperations s) {
        System.out.println("Inside Test Method\n\t" + "Recieved an string Operation");
        String returnedString = s.accept("endava", "training");
        System.out.println(returnedString);


    }


}
