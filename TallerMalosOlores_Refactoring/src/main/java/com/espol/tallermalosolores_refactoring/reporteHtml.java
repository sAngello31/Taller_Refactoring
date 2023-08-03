/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Torremar
 */
class reporteHtml extends Reporte {

    public String generarFormatoHTML(int cantidadProductos,
            double ingresos) {
        String html = "<HIML><TITLE>Reporte en HTML</TITLE>";
        html += "<HEAD>Reporte del flete "+formatearfecha() +"</ HEAD >";
        html += "<BODY>  < P > Este flete transporta " + cantidadProductos;
        html += " productos.</P>ln";
        html += "<P>Estos productos dejan un ingreso de " + ingresos;
        html += " USD, </P>\n</BODY><HTML>";
        return html;
    }

}
