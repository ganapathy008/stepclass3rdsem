package weekone;

import java.util.Scanner;

public class SignalStreak {
    static void findLongestStreak(String log) {
        int max = 1, cur = 1;
        char col = log.charAt(0);

        for (int i = 1; i < log.length(); i++) {
            if (log.charAt(i) == log.charAt(i - 1)) {
                cur++;
            } else {
                cur = 1;
            }
            if (cur > max) {
                max = cur;
                col = log.charAt(i);
            }
        }
        System.out.println("Longest Streak: '" + col + "' repeated " + max + " times");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter signal log (e.g. RRGGGYRR):");
        String log = sc.nextLine();
        findLongestStreak(log);
    }
}
