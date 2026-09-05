package weekthree.practisethree;

class Product {
    String productId;
    String productName;

    // Constructor to initialize fields
    Product(String productId, String productName) {
        this.productId = productId;
        this.productName = productName;
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Product p = new Product("P-1042", "Wireless Mouse");
        System.out.println(p.productId + " - " + p.productName);
    }
}
