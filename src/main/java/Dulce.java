/**
 * Clase abstracta que representa un dulce, que es un tipo de producto.
 */
abstract class Dulce extends Producto {
    public Dulce() {
        // Constructor vacío
    }
}

/**
 * Clase que representa un Snickers, un tipo específico de dulce.
 */
class Snickers extends Dulce {
    public Snickers() {
        // Constructor vacío
    }

    /**
     * Devuelve el nombre del producto.
     * 
     * @return El nombre del dulce, "snickers".
     */
    @Override
    public String getNombre() {
        return "snickers"; 
    }

    /**
     * Devuelve el precio del Snickers.
     * 
     * @return El precio del Snickers según el enum PrecioProducto.
     */
    @Override
    public int getPrecio() {
        return PrecioProducto.SNICKERS.getPrecio();
    }
}

/**
 * Clase que representa un Super8, un tipo específico de dulce.
 */
class Super8 extends Dulce {
    public Super8() {
        // Constructor vacío
    }

    /**
     * Devuelve el nombre del producto.
     * 
     * @return El nombre del dulce, "super8".
     */
    @Override
    public String getNombre() {
        return "super8";
    }

    /**
     * Devuelve el precio del Super8.
     * 
     * @return El precio del Super8 según el enum PrecioProducto.
     */
    @Override
    public int getPrecio() {
        return PrecioProducto.SUPER8.getPrecio();
    }
}
