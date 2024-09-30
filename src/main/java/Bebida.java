abstract class Bebida extends Producto {
    private int serie;

    public Bebida(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String beber();
}

class CocaCola extends Bebida{
    public CocaCola(int serie) {
        super(serie);
    }

    public String beber() {
        return "cocacola";
    }
}

class Sprite extends Bebida{
    public Sprite(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "sprite";
    }
}

class Fanta extends Bebida{
    public Fanta(int serie) {
        super(serie);
    }

    @Override
    public String beber() {
        return "fanta";
    }
}