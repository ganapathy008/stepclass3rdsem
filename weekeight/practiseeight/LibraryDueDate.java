package stepclass3rdsem.weekeight.practiseeight;
import java.util.*;
import java.time.*;

abstract class LibraryItem {
    String title;
    LibraryItem(String title) { this.title = title; }
    abstract LocalDate dueDate(LocalDate currentDate);
}

class Book extends LibraryItem {
    Book(String title) { super(title); }
    LocalDate dueDate(LocalDate currentDate) { return currentDate.plusDays(14); }
}

class Dvd extends LibraryItem {
    Dvd(String title) { super(title); }
    LocalDate dueDate(LocalDate currentDate) { return currentDate.plusDays(7); }
}

class Magazine extends LibraryItem {
    Magazine(String title) { super(title); }
    LocalDate dueDate(LocalDate currentDate) { return currentDate.plusDays(3); }
}

public class LibraryDueDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        LocalDate currentDate = LocalDate.of(2023, 10, 26);

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ", 2);
            String type = parts[0];
            String title = parts[1].replace("\"", "");
            LibraryItem item;
            if (type.equals("BOOK")) item = new Book(title);
            else if (type.equals("DVD")) item = new Dvd(title);
            else item = new Magazine(title);

            System.out.println(title + ": " + item.dueDate(currentDate));
        }
    }
}

