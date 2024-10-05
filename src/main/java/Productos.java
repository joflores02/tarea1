/**
 * Clase abstracta que representa un producto en el expendedor.
 * Debe ser extendida por clases concretas que representen productos específicos.
 */
abstract class Producto {
    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto como una cadena.
     */
    public abstract String getNombre();

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto como un entero.
     */
    public abstract int getPrecio();
}

/**
 * Enumeración que representa los precios de diferentes productos.
 * Incluye métodos para obtener el precio asociado a cada producto.
 */
enum PrecioProducto {
    COCA(1500),
    SPRITE(1400),
    FANTA(1300),
    SNICKERS(800),
    SUPER8(600);

    private final int precio;

    /**
     * Constructor para inicializar el precio del producto.
     *
     * @param precio El precio del producto.
     */
    PrecioProducto(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio asociado a la enumeración.
     *
     * @return El precio del producto como un entero.
     */
    public int getPrecio() {
        return precio;
    }
}