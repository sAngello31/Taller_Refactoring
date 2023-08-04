package Pregunta2;


import Pregunta2.Game;
import Pregunta2.Player;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Torremar
 * 
 */
public class RPMGame {

    public static void main(String args[]) {
        
        Player player1 = new Player();
        Player player2 = new Player();
        Game game = new Game(player1, player2);
        game.play();
    }
}
