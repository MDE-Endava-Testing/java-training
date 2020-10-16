package homeworks.christian.firstAssigment.herenciaAndInterface;

public class Humano implements Interface{

    private int cedula;
    private String name;

    public void pensar(){
        System.out.println("El humano esta pensado");
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
