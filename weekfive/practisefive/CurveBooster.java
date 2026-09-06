package weekfive.practisefive;

import java.util.Arrays;

public class CurveBooster {
    static void curveScores(int[] scores, int bonus) {
        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        curveScores(scores, 10);
        System.out.println(Arrays.toString(scores)); // [80, 95, 70]

        int[] scores2 = {40, 50, 60, 70};
        curveScores(scores2, 5);
        System.out.println(Arrays.toString(scores2)); // [45, 55, 65, 75]
    }
}

