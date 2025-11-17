package com.carrental;

/** Clase que representa un vehículo tipo Camión */
public class Camion extends Vehiculo {
    public Camion(String marca, String modelo, double precioDia) {
        super(marca, modelo, precioDia);
    }

    @Override
    public double calcularCosto(int dias) {
        // recargo del 20% por ser Camión
        return getPrecioDia() * dias * 1.2;
    }
}

