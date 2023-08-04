/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author Torremar
 */
public class Game {

    private Player player1;
    private Player player2;
    private int roundsPlayed;
    private int draws;

    public Game(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.roundsPlayed = 0;
        this.draws = 0;
    }

    public void play() {
        while (!isGameWon()) {
            Title();
            String result = Rounds();
            if (result.equals("Draw")) {
                draws++;
            }
            roundsPlayed++;
            System.out.println();
        }
        System.out.println("GAME WON");
    }

    private String determineRoundResult(Choice player1Choice, Choice player2Choice) {
        if (player1Choice.equals(player2Choice)) {
            return "Draw";
        } else if (player1Choice.winsOver(player2Choice)) {
            player1.setwins();
            return "Player 1 Wins";
        } else {
            player2.setwins();
            return "Player 2 Wins";
        }
    }

    private boolean isGameWon() {
        return player1.getwins() >= 3 || player2.getwins() >= 3;
    }

    private void Title() {
        System.out.println(" * * * * * * Round: " + roundsPlayed + "*********************\n");
        System.out.println("Number of Draws: " + draws + "\n");
    }

    private String Rounds() {
        Choice player1Choice = player1.playerChoice();
        System.out.println("Player 1: " + player1Choice.getName() + "\t Player 1 Total Wins: " + player1.getwins());
        Choice player2Choice = player2.playerChoice();
        System.out.println("Player 2: " + player2Choice.getName() + "\t Player 2 Total Wins: " + player2.getwins());
        String result = determineRoundResult(player1Choice, player2Choice);
        System.out.println(result);
        return result;
    }
}
