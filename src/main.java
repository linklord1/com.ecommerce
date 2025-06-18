public class main {

    public static void main(String[] args) {
        Order order = new Order(1001);

        order.attach(new PriceObserver());
        order.attach(new QuantityObserver());

        System.out.println("\nAdd item 1");
        order.addItem(50);
        System.out.println(order);

        System.out.println("\nAdd item 2");
        order.addItem(70);
        System.out.println(order);

        System.out.println("\nAdd item 3");
        order.addItem(90);
        System.out.println(order);

        System.out.println("\nAdd item 4");
        order.addItem(30);
        System.out.println(order);

        System.out.println("\nAdd item 5");
        order.addItem(40);
        System.out.println(order);

        System.out.println("\nAdd item 6");
        order.addItem(60);
        System.out.println(order);


        System.out.println("\nAdd item 7");
        order.addItem(14);
        System.out.println(order);

    }
}
