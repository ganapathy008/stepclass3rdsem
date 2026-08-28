package weekone;
import java.util.Scanner;

class TypingCheck {
    static void checkTypingAccuracy(String orig, String typed) {
        int match = 0, pos = -1;
        for (int i = 0; i < orig.length(); i++) {
            if (orig.charAt(i) == typed.charAt(i)) match++;
            else { pos = i + 1; break; }
        }
        double acc = (match * 100.0) / orig.length();
        System.out.print("Matched: " + match + "/" + orig.length() +
                         " | Accuracy: " + String.format("%.2f", acc) + "% | ");
        if (pos == -1)
            System.out.println("No Mismatches");
        else
            System.out.println("First Mismatch at position " + pos +
                               " ('" + orig.charAt(pos - 1) + "' vs '" + typed.charAt(pos - 1) + "')");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String orig = sc.nextLine();
        String typed = sc.nextLine();
        checkTypingAccuracy(orig, typed);
    }
}



