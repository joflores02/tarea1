/**
 * Clase que representa un comprador que intenta adquirir productos de un expendedor.
 */
class Comprador {
    
    private String productoComprado; // Nombre del producto comprado
    private int vuelto; // Total de vuelto recibido

    /**
     * Constructor que intenta realizar la compra de un producto.
     *
     * @param m      La moneda utilizada para la compra.
     * @param tipProd El tipo de producto que se desea comprar.
     * @param exp    El expendedor desde el cual se comprará el producto.
     */
    public Comprador(Moneda m, int tipProd, Expendedor exp) {
        try {
            // Intentar comprar un producto
            Producto producto = exp.comprarProducto(m, tipProd);
            if (producto != null) {
                productoComprado = producto.getNombre(); // Guardar el nombre del producto
            }
        } catch (PagoIncorrectoException | NoHayProductoException | PagoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage()); // Manejar excepciones de compra
        }

        // Calcular el vuelto
        Moneda mo = exp.getVuelto();
        while (mo != null) {
            vuelto += mo.getValor(); // Sumar el valor de cada moneda recibida como vuelto
            mo = exp.getVuelto(); // Obtener la siguiente moneda de vuelto
        }
    }
    
    /**
     * Devuelve el total de vuelto recibido por el comprador.
     * 
     * @return El total de vuelto.
     */
    public int cuantoVuelto() {
        return vuelto; // Retornar el total de vuelto
    }
    
    /**
     * Devuelve el nombre del producto que el comprador adquirió.
     * 
     * @return El nombre del producto comprado.
     */
    public String queCompraste() {
        return productoComprado; // Retornar el nombre del producto comprado
    }
}
