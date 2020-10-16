package homeworks.alejo.firstAssignment.interfaces;

public class ImplementacionOracle implements AccesoDatos{


    @Override
    public void insertar() {
        System.out.println("Insert from Oracle");
    }

    @Override
    public void listar() {
        System.out.println("List from Oracle");
    }
}
