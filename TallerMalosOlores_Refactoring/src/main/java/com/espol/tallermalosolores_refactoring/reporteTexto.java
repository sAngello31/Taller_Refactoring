/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Torremar
 */
class reporteTexto extends Reporte{

    public String generarFormatoTexto(int cantidadProductos,
                                         double ingresos) {
            String texto = "Reporte del flete " + formatearfecha() +"\n";
            texto += "Este flete transporta " + cantidadProductos;
            texto += "productos. Estos productos dejan ";
            texto += "un ingreso de "+ ingresos +"USD. ";
            return texto;
    }
}
