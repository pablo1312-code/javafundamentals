package com.carrental;

/** Clase que representa un vehículo tipo Sedan */
public class Sedan extends Vehiculo {
    public Sedan(String marca, String modelo, double precioDia) {
        super(marca, modelo, precioDia);
    }

    @Override
    public double calcularCosto(int dias) {
        return getPrecioDia() * dias;
    }
}
