package stepclass3rdsem.weekeight.practiseeight;
import java.util.*;

abstract class Delivery {
    double weight, distance;
    Delivery(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }
    abstract double fee();
}

class StandardDelivery extends Delivery {
    StandardDelivery(double weight, double distance) { super(weight, distance); }
    double fee() { return 5 + (0.5 * weight) + (0.1 * distance); }
}

class ExpressDelivery extends Delivery {
    ExpressDelivery(double weight, double distance) { super(weight, distance); }
    double fee() { return 15 + (1.0 * weight) + (0.2 * distance); }
}

class InternationalDelivery extends Delivery {
    double customFee;
    InternationalDelivery(double weight, double distance, double customFee) {
        super(weight, distance);
        this.customFee = customFee;
    }
    double fee() { return 25 + (2.0 * weight) + (0.5 * distance) + customFee; }
}

public class DeliveryFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("STANDARD")) {
                double w = sc.nextDouble(), d = sc.nextDouble();
                Delivery d1 = new StandardDelivery(w, d);
                double cost = d1.fee();
                total += cost;
                System.out.printf("STANDARD: %.2f%n", cost);
            } else if (type.equals("EXPRESS")) {
                double w = sc.nextDouble(), d = sc.nextDouble();
                Delivery d2 = new ExpressDelivery(w, d);
                double cost = d2.fee();
                total += cost;
                System.out.printf("EXPRESS: %.2f%n", cost);
            } else {
                double w = sc.nextDouble(), d = sc.nextDouble(), cf = sc.nextDouble();
                Delivery d3 = new InternationalDelivery(w, d, cf);
                double cost = d3.fee();
                total += cost;
                System.out.printf("INTERNATIONAL: %.2f%n", cost);
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}


