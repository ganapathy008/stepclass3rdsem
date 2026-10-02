package stepclass3rdsem.weekseven.practiseseven;
class PiggyBank {
    private double savings;
    private final String id;

    PiggyBank(String id) {
        this.id = id;
        this.savings = 0;
    }

    void deposit(double amount) {
        if (amount > 0) {
            savings += amount;
            System.out.println("Deposited: " + amount + " | Savings = " + savings);
        } else {
            System.out.println("Deposit rejected: amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > savings) {
            System.out.println("Withdraw rejected: insufficient savings.");
        } else {
            savings -= amount;
            System.out.println("Withdrawn: " + amount + " | Savings = " + savings);
        }
    }

    double getSavings() {
        return savings;
    }

    String getId() {
        return id;
    }
}

public class PiggyBank1 {
    public static void main(String[] args) {
        PiggyBank pb = new PiggyBank("PB-1");
        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);
    }
}


