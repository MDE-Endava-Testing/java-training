package lessons.polymorphism;

public abstract class Animal {

    protected String name;

    public void makeSound(){
        System.out.println("I am animal.. Grrrrr.....");
    }

    public void walk(){
        System.out.println("I am walking");
    }

}
