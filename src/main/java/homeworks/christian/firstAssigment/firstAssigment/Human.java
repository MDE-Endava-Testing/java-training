package homeworks.christian.firstAssigment.firstAssigment;

public class Human implements Interface{

    private int cedula;
    private String name;

    /**
     * This method print a sentence
     */
    public void think(){
        System.out.println("the human with name: " + name + " is thinking");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void communicate() {
        System.out.println("the human is communicating");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void feed() {
        System.out.println("the human is feeding");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void sleep() {
        System.out.println("the human is aleeping");
    }

    /**
     * method get cedula
     * @return cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * method set cedula
     * @param cedula
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * methos get name
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * method set name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
