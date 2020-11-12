package homeworks.christian.thirdAssigment.consumerInterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    /**
     * method main
     * @param args
     */
    public static void main(String[] args) {

        List<String> lista= Arrays.asList("hola","que","tal");
        lista.stream().forEach((x)->System.out.println(x));


        List<String> lista2=Arrays.asList("hola","que","tal");
        lista2.stream().map((x)->x.toUpperCase()).forEach((x)->System.out.println(x));

        List<Persona> lista3= Stream.generate(Persona::new)
                .limit(100)
                .peek((p)->p.setNombre("pepe"))
                .collect(Collectors.toList());
        for (Persona p: lista3) {
            System.out.println(p.getNombre());
        }
    }
}
