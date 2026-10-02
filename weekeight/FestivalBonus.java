package stepclass3rdsem.weekeight;
import java.util.*;

abstract class Employee {
    String name;
    double salary;
    Employee(String name, double salary) { this.name = name; this.salary = salary; }
    abstract double bonus();
}

class FullTime extends Employee {
    FullTime(String name, double salary) { super(name, salary); }
    double bonus() { return salary * 0.10; }
}

class PartTime extends Employee {
    PartTime(String name, double salary) { super(name, salary); }
    double bonus() { return salary * 0.05; }
}

class Intern extends Employee {
    Intern(String name, double salary) { super(name, salary); }
    double bonus() { return 2000; }
}

public class FestivalBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double sal = sc.nextDouble();
            Employee e;
            if (type.equals("FULLTIME")) e = new FullTime(name, sal);
            else if (type.equals("PARTTIME")) e = new PartTime(name, sal);
            else e = new Intern(name, sal);

            double b = e.bonus();
            total += b;
            System.out.printf("%s: %.2f%n", name, b);
        }
        System.out.printf("Total Bonus: %.2f%n", total);
    }
}


