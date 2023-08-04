package Pregunta2;


import Pregunta2.Choice;
import Pregunta2.Paper;
import Pregunta2.Rock;
import Pregunta2.Scissors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Torremar
 */
public class Player {

    int wins;
    int winTotal;

    public Choice playerChoice() {
        List<Choice> choices = ListaChoice();
        Random random = new Random();
        int index = random.nextInt(choices.size());
        return choices.get(index);
    }

    private List<Choice> ListaChoice() {
        List<Choice> choices = new ArrayList<>();
        choices.add(new Rock());
        choices.add(new Paper());
        choices.add(new Scissors());
        return choices;
    }

    public int setwins() {
        return wins++;
    }

    public int getwins() {
        return (wins);
    }

}
