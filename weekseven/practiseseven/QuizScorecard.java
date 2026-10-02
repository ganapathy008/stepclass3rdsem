package stepclass3rdsem.weekseven.practiseseven;
class Scorecard {
    private boolean[] results;
    private int count;

    Scorecard(int totalQuestions) {
        results = new boolean[totalQuestions];
        count = 0;
    }

    void recordAnswer(boolean isCorrect) {
        if (count < results.length) {
            results[count++] = isCorrect;
        } else {
            System.out.println("Cannot record more answers. Limit reached.");
        }
    }

    int getScore() {
        int score = 0;
        for (int i = 0; i < count; i++) {
            if (results[i]) score++;
        }
        return score;
    }
}

public class QuizScorecard {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);
        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Final Score: " + sc.getScore());
    }
}


