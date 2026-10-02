package stepclass3rdsem.weekeight;
import java.util.*;

abstract class Room {
    int units;
    Room(int units) { this.units = units; }
    abstract double bill();
}

class SingleRoom extends Room {
    SingleRoom(int units) { super(units); }
    double bill() { return units * 8; }
}

class SharedRoom extends Room {
    int occupants;
    SharedRoom(int units, int occupants) { super(units); this.occupants = occupants; }
    double bill() { return (units * 6.0) / occupants; }
}

class AcRoom extends Room {
    AcRoom(int units) { super(units); }
    double bill() { return units * 10 + 200; }
}

public class HostelElectricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            if (type.equals("SINGLE")) {
                int units = sc.nextInt();
                Room r = new SingleRoom(units);
                double cost = r.bill();
                total += cost;
                System.out.printf("SINGLE: %.2f%n", cost);
            } else if (type.equals("SHARED")) {
                int units = sc.nextInt();
                int occ = sc.nextInt();
                Room r = new SharedRoom(units, occ);
                double cost = r.bill();
                total += cost;
                System.out.printf("SHARED: %.2f%n", cost);
            } else {
                int units = sc.nextInt();
                Room r = new AcRoom(units);
                double cost = r.bill();
                total += cost;
                System.out.printf("AC: %.2f%n", cost);
            }
        }
        System.out.printf("Total: %.2f%n", total);
    }
}


