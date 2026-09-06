package weekfive;

import java.util.Arrays;

public class ScoreMultiplier {
    // Apply multipliers directly to the original array
    static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        playerScores[captainIndex] *= 2.0;      // Captain gets 2x
        playerScores[viceCaptainIndex] *= 1.5;  // Vice-Captain gets 1.5x
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 63};
        applyMultipliers(scores, 1, 3);
        System.out.println(Arrays.toString(scores));
    }
}

