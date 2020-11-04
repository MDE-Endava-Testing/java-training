package homeworks.alejo.firstAssignment.casting;

//Ejemplo de una conversion en la que tenemos una variable que apunta a objetos tipo hijo, pero no podemos acceder a sus
//metodos por lo que realizamos una conversion a la clase de tipo hijo para poder acceder a sus metodos

public class CastingTest {
    public static void main(String[] args) {
        Empleado empleado;

        //A menor jerarquia
        empleado = new Escritor("Jorge", 2000, Escritura.CLASICO);
        //Como le esta apuntando a un tipo de dato escritor nos retorna el metodo que tendria escritor y no empleado
        System.out.println(empleado.obtenerDetalles());

        // No puedo acceder
        //empleado.getTipodeEscrituratxt();
        // Para acceder a este metodo tenemos que hacer una conversion de empleado a escritor

        //Primera manera
        Escritor escritor = (Escritor) empleado;
        System.out.println(escritor.getTipoEscrituraTxt());

        //Segunda manera
        System.out.println(((Escritor) empleado).getTipoEscrituraTxt());

        empleado = new Gerente("Jose", 3000, "Sistemas");
        //Hacer el casting para que pueda acceder

    }
}
