package weektwo;
import java.util.Scanner;

public class Inventory {
    static void parseInventoryRecord(String csvLine) {
        csvLine = csvLine.trim();
        String[] fields = csvLine.split(",");

        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String product = fields[0].trim();
        String sku = fields[1].trim();
        String qty = fields[2].trim();

        System.out.println("Product: " + product +
                           " | SKU: " + sku +
                           " | Qty: " + qty);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter CSV line (Product,SKU,Qty):");
        String line = sc.nextLine();
        parseInventoryRecord(line);
    }
}


