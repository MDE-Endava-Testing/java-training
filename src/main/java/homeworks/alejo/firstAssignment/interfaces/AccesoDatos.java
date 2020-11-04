package homeworks.alejo.firstAssignment.interfaces;

public interface AccesoDatos {
    //Cualquier Variable va a ser una constante
    // De manera automatica en una interfas va a ser static final
    int MAX_REGISTROS = 10;

    public abstract void insertar();

    void listar();
}
