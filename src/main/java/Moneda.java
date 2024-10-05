/**
 * Clase abstracta que representa una moneda en el sistema.
 * Implementa la interfaz Comparable para permitir la comparación
 * de diferentes monedas en base a su valor.
 */
abstract class Moneda implements Comparable<Moneda> {
    public Moneda() {}

    /**
     * Obtiene el valor de la moneda.
     *
     * @return El valor de la moneda como un entero.
     */
    public abstract int getValor();

    /**
     * Compara esta moneda con otra moneda basada en su valor.
     *
     * @param otraMoneda La moneda con la que se va a comparar.
     * @return Un entero negativo, cero o positivo si esta moneda es 
     * menor, igual o mayor que la moneda especificada.
     */
    @Override
    public int compareTo(Moneda otraMoneda) {
        return Integer.compare(this.getValor(), otraMoneda.getValor());
    }
}

/**
 * Clase que representa una moneda de valor 1500.
 */
class Moneda1500 extends Moneda {
    public Moneda1500() {
        super();
    }

    /**
     * Obtiene el valor de la moneda.
     *
     * @return El valor de la moneda como un entero (1500).
     */
    @Override
    public int getValor() {
        return 1500;
    }
}

/**
 * Clase que representa una moneda de valor 1000.
 */
class Moneda1000 extends Moneda {
    public Moneda1000() {
        super();
    }

    /**
     * Obtiene el valor de la moneda.
     *
     * @return El valor de la moneda como un entero (1000).
     */
    @Override
    public int getValor() {
        return 1000;
    }
}

/**
 * Clase que representa una moneda de valor 500.
 */
class Moneda500 extends Moneda {
    public Moneda500() {
        super();
    }

    /**
     * Obtiene el valor de la moneda.
     *
     * @return El valor de la moneda como un entero (500).
     */
    @Override
    public int getValor() {
        return 500;
    }
}

/**
 * Clase que representa una moneda de valor 100.
 */
class Moneda100 extends Moneda {
    public Moneda100() {
        super();
    }

    /**
     * Obtiene el valor de la moneda.
     *
     * @return El valor de la moneda como un entero (100).
     */
    @Override
    public int getValor() {
        return 100;
    }
}