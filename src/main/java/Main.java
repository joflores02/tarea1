import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Crear un expendedor con 5 de cada producto
        Expendedor expendedor = new Expendedor(5);

        ArrayList<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda100());
        monedas.add(new Moneda500());
        monedas.add(new Moneda1000());
        monedas.add(new Moneda1500());
        monedas.add(new Moneda100());

        // Ordenar las monedas
        Collections.sort(monedas);

        System.out.println("Monedas ordenadas:");
        for (Moneda m : monedas) {
            System.out.println(m.getValor());
        }

        // Probar la compra de productos
        for (int i = 1; i <= 5; i++) {
            try {
                // Usar una moneda que tenga suficiente valor
                Moneda monedaDePrueba = monedas.get(monedas.size() - 1); // Usar la moneda de mayor valor
                Comprador comprador = new Comprador(monedaDePrueba, i, expendedor);

                System.out.println("Compraste: " + comprador.queCompraste());
                System.out.println("Vuelto: " + comprador.cuantoVuelto());

            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }

        // Probar un caso de pago incorrecto
        try {
            Moneda monedaNula = null; // Simulando un pago incorrecto
            Comprador comprador = new Comprador(monedaNula, Expendedor.COCA, expendedor);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar un caso de pago insuficiente
        try {
            Moneda monedaInsuficiente = new Moneda100(); // Precio de un producto es mayor
            Comprador comprador = new Comprador(monedaInsuficiente, Expendedor.COCA, expendedor);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar compra de un producto no disponible
        try {
            Moneda monedaSuficiente = new Moneda1500(); // Suficiente para cualquier producto
            Comprador comprador = new Comprador(monedaSuficiente, 10, expendedor); // Producto no válido
            System.out.println("Compraste: " + comprador.queCompraste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Probar compra de un producto que se ha agotado
        try {
            // Usar una moneda que tenga suficiente valor
            Moneda monedaDePrueba = new Moneda1500(); // Usar una moneda de valor alto
            // Consumir algunos productos hasta agotar el inventario
            for (int i = 1; i <= 5; i++) {
                new Comprador(monedaDePrueba, i, expendedor);
            }
            // Intentar comprar nuevamente CocaCola que ya no debería estar disponible
            Comprador comprador = new Comprador(monedaDePrueba, Expendedor.COCA, expendedor);
            System.out.println("Compraste: " + comprador.queCompraste());
            System.out.println("Vuelto: " + comprador.cuantoVuelto());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
