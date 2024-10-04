/**
 * Clase abstracta que representa una bebida, que es un tipo de producto.
 */
abstract class Bebida extends Producto {
    
    private final int serie; // Número de serie de la bebida

    /**
     * Constructor que inicializa la bebida con su número de serie.
     * 
     * @param serie El número de serie de la bebida.
     */
    public Bebida(int serie) {
        this.serie = serie;
    }

    /**
     * Devuelve el número de serie de la bebida.
     * 
     * @return El número de serie.
     */
    public int getSerie() {
        return serie;
    }
}

/**
 * Clase que representa una bebida tipo Sprite.
 */
class Sprite extends Bebida {
    
    /**
     * Constructor que inicializa una Sprite con su número de serie.
     * 
     * @param serie El número de serie de la bebida Sprite.
     */
    public Sprite(int serie) {
        super(serie);
    }
    
    /**
     * Devuelve el nombre del producto.
     * 
     * @return El nombre de la bebida, "sprite".
     */
    @Override
    public String getNombre() {
        return "sprite";
    } 

    /**
     * Devuelve el precio de la bebida Sprite.
     * 
     * @return El precio de la Sprite según el enum PrecioProducto.
     */
    @Override
    public int getPrecio() {
        return PrecioProducto.SPRITE.getPrecio();
    }
}

/**
 * Clase que representa una bebida tipo CocaCola.
 */
class CocaCola extends Bebida {
    
    /**
     * Constructor que inicializa una CocaCola con su número de serie.
     * 
     * @param serie El número de serie de la bebida CocaCola.
     */
    public CocaCola(int serie) {
        super(serie);
    }
    
    /**
     * Devuelve el nombre del producto.
     * 
     * @return El nombre de la bebida, "cocacola".
     */
    @Override
    public String getNombre() {
        return "cocacola";
    }

    /**
     * Devuelve el precio de la bebida CocaCola.
     * 
     * @return El precio de la CocaCola según el enum PrecioProducto.
     */
    @Override
    public int getPrecio() {
        return PrecioProducto.COCA.getPrecio();
    }
}

/**
 * Clase que representa una bebida tipo Fanta.
 */
class Fanta extends Bebida {
    
    /**
     * Constructor que inicializa una Fanta con su número de serie.
     * 
     * @param serie El número de serie de la bebida Fanta.
     */
    public Fanta(int serie) {
        super(serie);
    }
    
    /**
     * Devuelve el nombre del producto.
     * 
     * @return El nombre de la bebida, "fanta".
     */
    @Override
    public String getNombre() {
        return "fanta";
    }

    /**
     * Devuelve el precio de la bebida Fanta.
     * 
     * @return El precio de la Fanta según el enum PrecioProducto.
     */
    @Override
    public int getPrecio() {
        return PrecioProducto.FANTA.getPrecio();
    }
}
