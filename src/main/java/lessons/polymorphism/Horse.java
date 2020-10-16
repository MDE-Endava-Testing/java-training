package lessons.polymorphism;

public class Horse extends Animal {

    private int carryingCapacity;

    public void load(){
        System.out.println("600 pounds");
    }

    @Override
    public void walk(){
        System.out.println("I am galloping....");
    }

}
