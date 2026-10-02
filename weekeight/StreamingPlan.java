package stepclass3rdsem.weekeight;
import java.util.*;
import java.time.*;

abstract class Plan {
    String name;
    LocalDate startDate;
    Plan(String name, LocalDate startDate) { this.name = name; this.startDate = startDate; }
    abstract LocalDate renewalDate();
}

class Basic extends Plan {
    Basic(String name, LocalDate startDate) { super(name, startDate); }
    LocalDate renewalDate() { return startDate.plusDays(30); }
}

class Standard extends Plan {
    Standard(String name, LocalDate startDate) { super(name, startDate); }
    LocalDate renewalDate() { return startDate.plusDays(90); }
}

class Premium extends Plan {
    Premium(String name, LocalDate startDate) { super(name, startDate); }
    LocalDate renewalDate() { return startDate.plusDays(365); }
}

public class StreamingPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            String dateStr = sc.next();
            LocalDate start = LocalDate.parse(dateStr);
            Plan p;
            if (type.equals("BASIC")) p = new Basic(name, start);
            else if (type.equals("STANDARD")) p = new Standard(name, start);
            else p = new Premium(name, start);

            System.out.println(name + ": " + p.renewalDate());
        }
    }
}


