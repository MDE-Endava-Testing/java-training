package homeworks.christian.firstAssigment.herenciaAndInterface;

public class Animal implements Interface{

    private String raza;

    public void cuidar(){
        System.out.println("El animal esta cuidandonos");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comunicarse() {

    }

    @Override
    public void alimentarse() {

    }

    @Override
    public void dormir() {

    }
}
