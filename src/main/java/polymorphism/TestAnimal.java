package polymorphism;

import java.util.ArrayList;
import java.util.List;

public class TestAnimal {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Horse h = new Horse();
        List<Animal> animals = new ArrayList();
        animals.add(d);
        animals.add(c);
        animals.add(h);
        testAnimal(d);
        testAnimal(c);
        testAnimal(h);

        //Appplying downcasting
        for (int i = 0; i < animals.size(); i++) {
           // testAnimal(animals.get(i));
        }

    }

    private static void testAnimal(Dog d){
        d.makeSound();
        d.walk();
        d.guard();
    }
    private static void testAnimal(Cat d){
        d.makeSound();
        d.walk();
    }

    private static void testAnimal(Horse d){
        d.makeSound();
        d.walk();
        d.load();
    }



}
