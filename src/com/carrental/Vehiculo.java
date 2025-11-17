package com.carrental;

public abstract class Vehiculo {
    private String marca;
    private String modelo;
    private double precioDia;
    private boolean disponible;

    public Vehiculo(String marca, String modelo, double precioDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioDia = precioDia;
        this.disponible = true;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPrecioDia() { return precioDia; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }

    public abstract double calcularCosto(int dias);

    @Override
    public String toString() {
        return marca + " " + modelo + " - " + precioDia + " €/día" + (disponible ? " (Disponible)" : " (No disponible)");
    }
}
