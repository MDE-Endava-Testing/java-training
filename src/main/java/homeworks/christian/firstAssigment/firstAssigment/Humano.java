package homeworks.christian.firstAssigment.firstAssigment;

public class Humano implements Interface{

    private int cedula;
    private String name;

    public void pensar(){
        System.out.println("El humano llamado " + name + " esta pensado");
    }

    @Override
    public void comunicarse() {
        System.out.println("El humano esta comunicandose");
    }

    @Override
    public void alimentarse() {
        System.out.println("El humano esta alimentandose");
    }

    @Override
    public void dormir() {
        System.out.println("El humano esta durmiendo");
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
}
