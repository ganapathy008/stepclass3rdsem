package weekthree;
import java.util.Scanner;

public class Mirror {
    static String reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String w : words) {
            result.append(new StringBuilder(w).reverse()).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine();
        System.out.println(reverseEachWord(sentence));
    }
}


