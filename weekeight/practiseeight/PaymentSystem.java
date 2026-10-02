package stepclass3rdsem.weekeight.practiseeight;
import java.util.*;

abstract class Payment {
    double amount;
    Payment(double amount) { this.amount = amount; }
    abstract double finalAmount();
}

class CardPayment extends Payment {
    CardPayment(double amount) { super(amount); }
    double finalAmount() { return amount * 1.02; } // 2% fee
}

class WalletPayment extends Payment {
    WalletPayment(double amount) { super(amount); }
    double finalAmount() { return amount * 1.01; } // 1% fee
}

class BankTransferPayment extends Payment {
    BankTransferPayment(double amount) { super(amount); }
    double finalAmount() { return amount; } // no fee
}

public class PaymentSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amt = sc.nextDouble();
            Payment p;
            if (type.equals("CARD")) p = new CardPayment(amt);
            else if (type.equals("WALLET")) p = new WalletPayment(amt);
            else p = new BankTransferPayment(amt);

            double finalAmt = p.finalAmount();
            total += finalAmt;
            System.out.printf("%s: %.2f%n", type, finalAmt);
        }
        System.out.printf("Total: %.2f%n", total);
    }
}


