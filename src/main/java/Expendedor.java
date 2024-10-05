/**
 * Clase que representa un expendedor de productos.
 * Administra el stock de diferentes tipos de bebidas y dulces,
 * y permite la compra de productos mediante monedas.
 */
class Expendedor {

    private final Deposito<Dulce> dsnickers; // Depósito de Snickers
    private final Deposito<Dulce> dsuper8;   // Depósito de Super8
    private final Deposito<Bebida> dcoca;     // Depósito de Coca Cola
    private final Deposito<Bebida> dsprite;   // Depósito de Sprite
    private final Deposito<Bebida> dfanta;    // Depósito de Fanta
    private final Deposito<Moneda> dm;        // Depósito de monedas

    public static final int COCA = 1;    // Constante para Coca Cola
    public static final int SPRITE = 2;   // Constante para Sprite
    public static final int FANTA = 3;    // Constante para Fanta
    public static final int SNICKERS = 4; // Constante para Snickers
    public static final int SUPER8 = 5;   // Constante para Super8

    /**
     * Constructor que inicializa el expendedor con una cantidad específica de productos.
     *
     * @param cantproducto La cantidad de cada tipo de producto que se añadirá al expendedor.
     */
    public Expendedor(int cantproducto) {
        dcoca = new Deposito<>();
        dfanta = new Deposito<>();
        dsprite = new Deposito<>();
        dsuper8 = new Deposito<>();
        dsnickers = new Deposito<>();
        dm = new Deposito<>();

        for (int i = 0; i < cantproducto; i++) {
            dcoca.addItem(new CocaCola(100 + i));
            dsprite.addItem(new Sprite(200 + i));
            dfanta.addItem(new Fanta(300 + i));
            dsnickers.addItem(new Snickers());
            dsuper8.addItem(new Super8());
        }
    }

    /**
     * Permite la compra de un producto utilizando una moneda.
     *
     * @param m La moneda utilizada para la compra.
     * @param prod El tipo de producto a comprar.
     * @return El producto comprado.
     * @throws PagoIncorrectoException Si la moneda es nula.
     * @throws NoHayProductoException Si no hay productos disponibles.
     * @throws PagoInsuficienteException Si el valor de la moneda es menor que el precio del producto.
     */
    public Producto comprarProducto(Moneda m, int prod)
            throws PagoIncorrectoException, NoHayProductoException, PagoInsuficienteException {

        if (m == null) {
            throw new PagoIncorrectoException("Pago incorrecto: No tienes dinero.");
        }

        Producto producto = null;
        int precioProducto = 0;

        switch (prod) {
            case COCA -> {
                precioProducto = PrecioProducto.COCA.getPrecio();
                producto = dcoca.getItem();
            }
            case SPRITE -> {
                precioProducto = PrecioProducto.SPRITE.getPrecio();
                producto = dsprite.getItem();
            }
            case FANTA -> {
                precioProducto = PrecioProducto.FANTA.getPrecio();
                producto = dfanta.getItem();
            }
            case SNICKERS -> {
                precioProducto = PrecioProducto.SNICKERS.getPrecio();
                producto = dsnickers.getItem();
            }
            case SUPER8 -> {
                precioProducto = PrecioProducto.SUPER8.getPrecio();
                producto = dsuper8.getItem();
            }
            default -> throw new NoHayProductoException("Tipo de producto no valido.");
        }

        // Verificar si hay producto y si se puede pagar
        if (producto == null) {
            throw new NoHayProductoException("No hay producto disponible en el depósito.");
        }

        if (m.getValor() < precioProducto) {
            throw new PagoInsuficienteException("Pago insuficiente: la moneda no alcanza.");
        }

        // Calcular el vuelto
        int vuelto = m.getValor() - precioProducto;
        while (vuelto >= 100) {
            dm.addItem(new Moneda100());
            vuelto -= 100;
        }

        return producto;
    }

    /**
     * Obtiene una moneda del vuelto del expendedor.
     *
     * @return Una moneda del depósito de vuelto, o null si no hay más monedas.
     */
    public Moneda getVuelto() {
        return dm.getItem();
    }
}