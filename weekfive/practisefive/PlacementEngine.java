package weekfive.practisefive;

import java.util.Arrays;

class Candidate implements Comparable<Candidate> {
    String name;
    double cgpa;
    int codingScore;

    // Constructor
    public Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // Overloaded eligibility checks
    static boolean isEligible(double cgpa) {
        // Rule: Strong CGPA alone qualifies (≥ 8.0)
        return cgpa >= 8.0;
    }

    static boolean isEligible(double cgpa, int codingScore) {
        // Rule: Borderline CGPA (≥ 6.5) + strong coding score (≥ 70)
        return cgpa >= 6.5 && codingScore >= 70;
    }

    // Composite score = CGPA * 10 + codingScore
    public double compositeScore() {
        return cgpa * 10 + codingScore;
    }

    // Comparable implementation for sorting by composite score (descending)
    @Override
    public int compareTo(Candidate other) {
        return Double.compare(other.compositeScore(), this.compositeScore());
    }

    @Override
    public String toString() {
        return name + " (" + compositeScore() + ")";
    }
}

public class PlacementEngine {
    static void shortlistAndRank(Candidate[] candidates) {
        Candidate[] shortlisted = Arrays.stream(candidates)
                .filter(c -> Candidate.isEligible(c.cgpa) || Candidate.isEligible(c.cgpa, c.codingScore))
                .toArray(Candidate[]::new);

        Arrays.sort(shortlisted);

        for (int i = 0; i < shortlisted.length; i++) {
            System.out.println((i + 1) + ". " + shortlisted[i]);
        }
    }

    public static void main(String[] args) {
        Candidate[] candidates = {
            new Candidate("Aisha", 8.2, 65),
            new Candidate("Rohit", 10.0, 55),
            new Candidate("Karan", 6.5, 85),
            new Candidate("Meera", 7.0, 90),
            new Candidate("Dev", 9.5, 40)
        };

        shortlistAndRank(candidates);
    }
}

