import java.util.ArrayList;

/**
 * Clase genérica que representa un depósito para almacenar objetos de tipo T.
 *
 * @param <T> el tipo de los objetos que se almacenan en el depósito.
 */
class Deposito<T> {
    
    private final ArrayList<T> items; // Lista que almacena los objetos

    /**
     * Constructor que inicializa el depósito.
     */
    public Deposito() {
        items = new ArrayList<>(); // Inicializa la lista de items
    }

    /**
     * Agrega un item al depósito.
     * 
     * @param item El item a agregar.
     */
    public void addItem(T item) {
        items.add(item); // Añade el item a la lista
    }

    /**
     * Obtiene y elimina el primer item del depósito.
     * 
     * @return El primer item del depósito, o null si está vacío.
     */
    public T getItem() {
        if (!items.isEmpty()) {
            return items.remove(0); // Retorna y elimina el primer item
        } else {
            return null; // Retorna null si no hay items
        }
    }

    /**
     * Verifica si el depósito está vacío.
     * 
     * @return true si el depósito está vacío, false en caso contrario.
     */
    public boolean isEmpty() {
        return items.isEmpty(); // Verifica si la lista de items está vacía
    }
}
