abstract class Dulce extends Producto {
    private int serie;

    public Dulce(int serie){
        this.serie = serie;
    }

    public int getSerie(){
        return serie;
    }

    public abstract String comer();
}

class Snickers extends Dulce{
    public Snickers(int serie) {
        super(serie);
    }

    public String comer() {
        return "snickers";
    }
}

class Super8 extends Dulce{
    public Super8(int serie) {
        super(serie);
    }

    public String comer() {
        return "super8";
    }
}
