package weekone;

import java.util.Scanner;

public class ReviewWords {
    static void classifyWordLengths(String review) {
        String[] words = review.split(" ");
        int shortCount = 0, mediumCount = 0, longCount = 0;

        for (String w : words) {
            int len = w.length();
            if (len >= 1 && len <= 4) shortCount++;
            else if (len <= 8) mediumCount++;
            else longCount++;
        }

        System.out.println("Short: " + shortCount +
                           " | Medium: " + mediumCount +
                           " | Long: " + longCount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter movie review:");
        String review = sc.nextLine();
        classifyWordLengths(review);
    }
}

