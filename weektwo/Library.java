package weektwo;
import java.util.Scanner;

public class Library {
    static String normalizeCatalog(String raw) {
        // Trim spaces and remove dashes/underscores
        return raw.trim().replaceAll("[-_]", "");
    }

    static void validateAndFormat(String code) {
        if (code.length() != 12) {
            System.out.println("Invalid: wrong length");
            return;
        }

        String pen = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7);

        if (!pen.matches("[A-Za-z]{3}")) {
            System.out.println("Invalid: publisher code must be 3 letters");
        } else if (!year.matches("\\d{4}") || !catalog.matches("\\d{5}")) {
            System.out.println("Invalid: year/catalog must be digits");
        } else {
            System.out.println("[" + pen.toUpperCase() + "] YEAR: " + year + " | CATALOG: " + catalog);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter raw ISBN code:");
        String raw = sc.nextLine();
        String normalized = normalizeCatalog(raw);
        validateAndFormat(normalized);
    }
}


