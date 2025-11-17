package com.carrental;

/** Clase que representa un empleado del sistema */
public class Empleado {
    private String nombre;
    private int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() { return nombre; }
    public int getId() { return id; }
    @Override
    public String toString() {
        return "Empleado #" + id + " - " + nombre;
    }
}
