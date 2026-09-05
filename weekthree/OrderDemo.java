package weekthree;

class Order {
    static int totalOrders = 0;

    // Constructor increments totalOrders each time an object is created
    Order() {
        totalOrders++;
    }
}

public class OrderDemo {
    public static void main(String[] args) {
        // Create 4 Order objects
        Order o1 = new Order();
        Order o2 = new Order();
        Order o3 = new Order();
        Order o4 = new Order();

        // Print totalOrders once, accessed via class name
        System.out.println("Total orders: " + Order.totalOrders);
    }
}


