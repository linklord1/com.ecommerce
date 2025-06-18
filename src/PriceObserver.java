public class PriceObserver implements OrderObserver{
    private boolean discountApplied = false;

    @Override
    public void update(Order order) {
        if (!discountApplied && order.getItemCost() > 200) {
            System.out.println("Applying $20 discount...");
            order.setItemCost(order.getItemCost() - 20);
            discountApplied = true;
        }
    }
}
