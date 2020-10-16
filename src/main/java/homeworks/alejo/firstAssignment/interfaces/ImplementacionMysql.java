package homeworks.alejo.firstAssignment.interfaces;

public class ImplementacionMysql implements  AccesoDatos{

    @Override
    public void insertar() {
        System.out.println("Insert from Mysql");
    }

    @Override
    public void listar() {
        System.out.println("List from Mysqk");
    }
}
