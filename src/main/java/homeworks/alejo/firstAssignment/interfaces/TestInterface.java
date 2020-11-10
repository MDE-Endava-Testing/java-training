package homeworks.alejo.firstAssignment.interfaces;

public class TestInterface {
    public static void main(String[] args) {
        AccesoDatos datos = new ImplementacionOracle();
        datos.insertar();

        datos = new ImplementacionMysql();
        datos.insertar();
    }
}
