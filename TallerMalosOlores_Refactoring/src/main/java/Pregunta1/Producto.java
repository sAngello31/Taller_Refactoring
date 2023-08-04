package Pregunta1;


import Pregunta1.TipoProducto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Torremar
 */
class Producto {

    private TipoProducto tipoProducto;
    private double peso;
    private long id;
    private double distanciaDestino;

    public Producto(TipoProducto tipoProducto, double peso, long id, double distanciaDestino) {
        this.tipoProducto = tipoProducto;
        this.peso = peso;
        this.id = id;
        this.distanciaDestino = distanciaDestino;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public double getPeso() {
        return peso;
    }

    public void setValue(Object value) {
        if (value instanceof TipoProducto) {
            tipoProducto = (TipoProducto) value;
        } else if (value instanceof Double) {
            peso = ((Double) value).doubleValue();
        }
    }

    public double getDistanciaDestino() {
        return distanciaDestino;
    }

    public double calcularCobroPorducto() {
        double cobro = 0;
        switch (getTipoProducto()){
            case Fragil:
                // 500 es el cobro base y 0.55 el factor de distancia
                cobro = 500 + getDistanciaDestino() * 0.55;
                break;
            case Regular:
                // 250 es el cobro base, 0.25 es el factor de distancia
                // y 10 es el factor de recargo por peso
                cobro = 250 + getDistanciaDestino() * 0.25 + getPeso() * 0;
                break;
            case Pesado:
                if (peso > 30) //cobro base es 999 y factores son 0.9 y 9
                {
                    cobro = 999 + getDistanciaDestino() * 0.9 + getPeso() * 9;
                } else //cobro base es 750 y factor de distancia es 0.6
                {
                    cobro = 750 + getDistanciaDestino() * 0.6;
                }
                break;
        }
        return cobro;
    }

}
