package com.carrental;

import java.util.ArrayList;
import java.util.List;

/** Clase que gestiona el inventario de vehículos disponibles */
public class InventarioVehiculos {
    private List<Vehiculo> listaVehiculos = new ArrayList<>();

    public void agregarVehiculo(Vehiculo v) {
        listaVehiculos.add(v);
    }

    public void mostrarDisponibles() {
        System.out.println("=== Vehículos Disponibles ===");
        for (Vehiculo v : listaVehiculos) {
            if (v.isDisponible()) {
                System.out.println("- " + v);
            }
        }
    }

    public Vehiculo buscarVehiculo(String modelo) {
        for (Vehiculo v : listaVehiculos) {
            if (v.getModelo().equalsIgnoreCase(modelo) && v.isDisponible()) {
                return v;
            }
        }
        return null;
    }
}
