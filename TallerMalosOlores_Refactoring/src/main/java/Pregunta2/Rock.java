/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author Torremar
 */
public class Rock implements Choice{

    @Override
    public String getName() {
        return "rock";
    }

    @Override
    public boolean winsOver(Choice otroChoice) {
        return otroChoice instanceof Scissors;
    }
    
}
