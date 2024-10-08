/**
 * Clase que representa las posibles excepciones que pueden ocurrir al momento de comprar algun item.
 */

public class Excepciones {
    
}

/**
 * Excepción para manejar pagos incorrectos.
 */
class PagoIncorrectoException extends Exception {
    public PagoIncorrectoException(String message) {
        super(message); // Llama al constructor de la clase base Exception
    }
}

/**
 * Excepción para manejar la falta de productos.
 */
class NoHayProductoException extends Exception {
    public NoHayProductoException(String message) {
        super(message);
    }
}

/**
 * Excepción para manejar pagos insuficientes.
 */
class PagoInsuficienteException extends Exception {
    public PagoInsuficienteException(String message) {
        super(message);
    }
}
