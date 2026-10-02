package stepclass3rdsem.weeksix;
class PayrollAccount {
    double basicSalary;
    double bonus;

    PayrollAccount(double basicSalary) {
        this.basicSalary = basicSalary;
        this.bonus = 0;
    }

    void creditBonus(double amount) {
        bonus += amount;
    }

    void deductTax(double percent) {
        basicSalary -= (basicSalary * percent / 100);
    }

    double getNetSalary() {
        return basicSalary + bonus;
    }
}

public class PayrollAccountTest {
    public static void main(String[] args) {
        PayrollAccount acc = new PayrollAccount(50000);
        acc.creditBonus(5000);
        acc.deductTax(10);
        System.out.println("Net salary: Rs " + acc.getNetSalary());
    }
}


