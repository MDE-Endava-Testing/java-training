package homeworks.alejo.firstAssignment.casting;

public class Escritor extends Empleado{

    final Escritura tipoEscritura;

    public Escritor(String nombre, double sueldo, Escritura tipoEscritura){
        super(nombre, sueldo);
        this.tipoEscritura =tipoEscritura;
    }

    public String obtenerDetalles(){
        return super.obtenerDetalles() + " Tipo de escritura " + tipoEscritura.getDescripcion();
    }

    public Escritura getTipoEscritura() {
        return tipoEscritura;
    }
    public String  getTipoEscrituraTxt() {
        return tipoEscritura.getDescripcion();
    }


}
