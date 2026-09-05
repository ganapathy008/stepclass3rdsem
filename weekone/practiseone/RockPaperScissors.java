package weekone.practiseone;

import java.util.Random;

public class RockPaperScissors {
    static String[] moves = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equals(computerMove)) return "Draw";
        if ((playerMove.equals("Rock") && computerMove.equals("Scissors")) ||
            (playerMove.equals("Paper") && computerMove.equals("Rock")) ||
            (playerMove.equals("Scissors") && computerMove.equals("Paper"))) {
            return "Player Wins";
        }
        return "Computer Wins";
    }

    public static void main(String[] args) {
        Random rand = new Random();
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"}; // demo inputs
        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round | Player | Computer | Result");
        for (int i = 0; i < playerMoves.length; i++) {
            String player = playerMoves[i];
            String computer = moves[rand.nextInt(3)];
            String result = playRound(player, computer);

            System.out.println((i+1) + "     | " + player + " | " + computer + " | " + result);

            if (result.equals("Player Wins")) wins++;
            else if (result.equals("Computer Wins")) losses++;
            else draws++;
        }

        double winPercent = (wins * 100.0) / playerMoves.length;
        System.out.println("Wins: " + wins + " / Losses: " + losses + " / Draws: " + draws + " / Win % = " + winPercent + "%");
    }
}
