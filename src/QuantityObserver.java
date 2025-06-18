public class QuantityObserver implements  OrderObserver{
    private boolean freeShippingApplied = false;

    @Override
    public void update(Order order) {
        if (!freeShippingApplied && order.getCount() > 5) {
            System.out.println("Free shipping applied!");
            order.setShippingCost(0);
            freeShippingApplied = true;
        }
    }
}
