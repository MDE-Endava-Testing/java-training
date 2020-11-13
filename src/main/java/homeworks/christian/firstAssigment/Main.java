package homeworks.christian.firstAssigment;

public class Main {

    /**
     * This method is the main method
     * @param args
     */
    public static void main(String[] args){
        Human man = new Human();
        man.setName("Carlos");
        man.setCedula(1094938619);
        man.feed();
        man.communicate();
        man.sleep();
        man.think();

        System.out.println();

        Animal domestic = new Animal();
        domestic.setRaza("Pastor aleman");
        domestic.feed();
        domestic.communicate();
        domestic.sleep();
        domestic.care();

        System.out.println();

        Man father = new Man();
        father.setName("Senior Carlos");
        father.setCedula(1094966455);
        father.feed();
        father.communicate();
        father.sleep();
        father.think();

        System.out.println();

        Woman mother = new Woman();
        mother.setName("Luisa");
        mother.setCedula(1094966555);
        mother.feed();
        mother.communicate();
        mother.sleep();
        mother.think();

        System.out.println();

        Dog doberman = new Dog();
        doberman.aullar();

        Cat miau = new Cat();
        miau.meow();

    }
}
