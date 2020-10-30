package homeworks.christian.firstAssigment.firstAssigment;

public class Animal implements Interface{

    private String raza;

    /**
     * This method print a sentence
     */
    public void care(){
        System.out.println("the animal with race: " + raza + " is care us");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void communicate() {
        System.out.println("the animal is communicating");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void feed() {
        System.out.println("the animal is feeding");
    }

    /**
     * This method print a sentence
     */
    @Override
    public void sleep() {
        System.out.println("the animal is aleeping");
    }

    /**
     * method get
     * @return raza
     */
    public String getRaza() {
        return raza;
    }

    /**
     * method set
     * @param raza
     */
    public void setRaza(String raza) {
        this.raza = raza;
    }
}
