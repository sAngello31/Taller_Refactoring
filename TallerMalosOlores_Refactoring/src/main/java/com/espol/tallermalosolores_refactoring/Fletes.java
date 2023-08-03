
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Torremar
 */
public class Fletes {

    private enum TipoProducto {
        Fragil, Regular, Pesado
    };
    private List<Producto> productos;
    private reporteTexto reporteTexto;
    private reporteHtml reporteHtml;

    public Fletes() {
        productos = new ArrayList<Producto>();
    }

    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

    public double calcularIngresos() {
        double totalIngresos = 0;
        for (Producto producto : productos) {
            double ingreso = producto.calcularCobroPorducto();
            totalIngresos += ingreso;
        }
        return totalIngresos;
    }

    public String imprimirReporte() {
        String contenido = "";
        if (reporteTexto != null) {
            contenido = reporteTexto.generarFormatoTexto(productos.size(), calcularIngresos());
        } else if (reporteHtml != null) {
            contenido = reporteHtml.generarFormatoHTML(productos.size(), calcularIngresos());
        }
        return contenido;
    }
    
    private void setReporteTexto(reporteTexto reporteTexto) {
        this.reporteTexto = reporteTexto;
    }
    
    private void setReporteHtml(reporteHtml reporteHtml) {
        this.reporteHtml = reporteHtml;
    }
}
