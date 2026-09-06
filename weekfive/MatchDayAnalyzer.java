package weekfive;

public class MatchDayAnalyzer {

    // Helper method to compute average of one match (row)
    static double rowAverage(int[] row) {
        int sum = 0;
        for (int score : row) {
            sum += score;
        }
        return (double) sum / row.length;
    }

    // Classify matches based on threshold
    static String classifyMatches(int[][] runsPerOver, int threshold) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < runsPerOver.length; i++) {
            double avg = rowAverage(runsPerOver[i]);
            if (avg >= threshold) {
                result.append("Match ").append(i).append(": Power Surge");
            } else {
                result.append("Match ").append(i).append(": Normal");
            }
            if (i < runsPerOver.length - 1) result.append(" | ");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int[][] runsPerOver = {
            {4, 6, 8}, 
            {2, 3, 1}, 
            {12, 12, 14}
        };
        int threshold = 8;

        System.out.println(classifyMatches(runsPerOver, threshold));
    }
}

