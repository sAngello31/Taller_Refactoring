
import java.text.SimpleDateFormat;
import java.util.Calendar;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Torremar
 */
public class Reporte {

    private Calendar cal;

    public Reporte() {
        cal = Calendar.getInstance();
    }

    public String formatearfecha() {
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-Y");
        return formato.format(cal.getTime());
    }
}