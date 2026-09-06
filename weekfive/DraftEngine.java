package weekfive;

import java.util.Arrays;

class Player implements Comparable<Player> {
    String name;
    int matchesPlayed;
    double battingAverage;
    boolean injured;

    // Constructor
    public Player(String name, int matchesPlayed, double battingAverage, boolean injured) {
        this.name = name;
        this.matchesPlayed = matchesPlayed;
        this.battingAverage = battingAverage;
        this.injured = injured;
    }

    // Overloaded draft rules
    public boolean isDraftable(int matchesPlayed) {
        // Rule: Experienced players qualify if matches ≥ 10
        return matchesPlayed >= 10;
    }

    public boolean isDraftable(int matchesPlayed, boolean injured) {
        // Rule: Newer players need ≥ 5 matches and not injured
        return matchesPlayed >= 5 && !injured;
    }

    // Comparable implementation for sorting by battingAverage (descending)
    @Override
    public int compareTo(Player other) {
        return Double.compare(other.battingAverage, this.battingAverage);
    }

    @Override
    public String toString() {
        return name + " (Matches: " + matchesPlayed + ", Avg: " + battingAverage + ", Injured: " + injured + ")";
    }
}

public class DraftEngine {
    public static void draftRank(Player[] players) {
        // Filter draftable players
        Player[] draftable = Arrays.stream(players)
                .filter(p -> p.isDraftable(p.matchesPlayed) || p.isDraftable(p.matchesPlayed, p.injured))
                .toArray(Player[]::new);

        // Sort by battingAverage descending
        Arrays.sort(draftable);

        // Print ranking
        for (int i = 0; i < draftable.length; i++) {
            System.out.println((i + 1) + ". " + draftable[i].name);
        }
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Rahul", 15, 48.0, false),
            new Player("Virat", 13, 55.0, false),
            new Player("Jas", 8, 30.0, true),
            new Player("Dev", 12, 40.0, true)
        };

        draftRank(players);
    }
}
