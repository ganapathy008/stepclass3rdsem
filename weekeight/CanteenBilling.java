package stepclass3rdsem.weekeight;
import java.util.*;

abstract class Customer {
    double amount;
    Customer(double amount) { this.amount = amount; }
    abstract double finalAmount();
}

class Student extends Customer {
    Student(double amount) { super(amount); }
    double finalAmount() { return amount * 0.9; } // 10% discount
}

class Staff extends Customer {
    Staff(double amount) { super(amount); }
    double finalAmount() { return amount * 0.95; } // 5% discount
}

class Guest extends Customer {
    Guest(double amount) { super(amount); }
    double finalAmount() { return amount + 10; } // service charge
}

public class CanteenBilling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amt = sc.nextDouble();
            Customer c;
            if (type.equals("STUDENT")) c = new Student(amt);
            else if (type.equals("STAFF")) c = new Staff(amt);
            else c = new Guest(amt);

            double finalAmt = c.finalAmount();
            total += finalAmt;
            System.out.printf("%s: %.2f%n", type, finalAmt);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}

