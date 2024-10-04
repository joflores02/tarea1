import java.util.ArrayList;
public class Deposito<T> {

    private final ArrayList<T> items;
    public Deposito() {
        items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public T getItem() {
        if (!items.isEmpty()) {
            return items.remove(0);
        } else {
            return null;
        }
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }
}
