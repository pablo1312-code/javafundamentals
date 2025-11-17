package com.carrental;

/** Clase que gestiona la información de un pago */
public class Pago {
    private double monto;
    private String metodo;

    public Pago(double monto, String metodo) {
        this.monto = monto;
        this.metodo = metodo;
    }

    public void mostrarPago() {
        System.out.println("Pago de " + monto + "€ realizado mediante " + metodo + ".");
    }
}
