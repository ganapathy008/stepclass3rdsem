package weekfive.practisefive;

import java.util.Arrays;

public class TopThreeFinder {
    static int[] findTopThreeScores(int[] scores) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int score : scores) {
            if (score >= first) {
                third = second;
                second = first;
                first = score;
            } else if (score >= second) {
                third = second;
                second = score;
            } else if (score >= third) {
                third = score;
            }
        }
        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        int[] scores1 = {45, 82, 79, 90, 83, 90, 61};
        System.out.println(Arrays.toString(findTopThreeScores(scores1))); // [90, 90, 82]

        int[] scores2 = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(findTopThreeScores(scores2))); // [50, 40, 30]
    }
}

