package homeworks.christian.firstAssigment.herenciaAndInterface;

public class Animal implements Interface{

    private String raza;

    public void cuidar(){
        System.out.println("El animal de raza: " + raza + " esta cuidandonos");
    }

    @Override
    public void comunicarse() {
        System.out.println("El animal esta comunicandose");
    }

    @Override
    public void alimentarse() {
        System.out.println("El animal esta alimentandose");
    }

    @Override
    public void dormir() {
        System.out.println("El animal esta durmiendo");
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
