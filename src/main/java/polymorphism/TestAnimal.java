package polymorphism;

public class TestAnimal {

    public static void main(String[] args) {
        Dog d = new Dog();
        testDog(d);

    }

    private static void testDog(Dog d){
        d.makeSound();
        d.walk();;
    }


}
