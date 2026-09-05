package weekthree.practisethree;

class Order {
    static int totalOrders = 0;

    Order() {
        totalOrders++;
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        new Order();
        new Order();
        new Order();
        new Order();

        System.out.println("Total orders: " + Order.totalOrders);
    }
}
