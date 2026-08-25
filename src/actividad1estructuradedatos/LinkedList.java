package actividad1estructuradedatos;

public interface LinkedList<T> {

    boolean estaVacia();

    int tamano();

    void insertarInicio(T dato);

    void insertarFinal(T dato);

    boolean eliminar(T dato);

    boolean buscar(T dato);

    String mostrar();

    T obtenerInicio();

    T eliminarInicio();
}