import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private int itemCount = 0;
    private double itemCost = 0;
    private double shippingCost = 10;
    private List<OrderObserver> observers = new ArrayList<>();

    public Order(int id) {
        this.id = id;
    }
}
