package com.carrental;

import java.util.Scanner;

/**
 * Clase principal que simula el flujo del sistema.
 * Incluye interacción básica por consola.
 */
public class SistemaAlquiler {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear inventario
        InventarioVehiculos inventario = new InventarioVehiculos();
        inventario.agregarVehiculo(new Sedan("Toyota", "Corolla", 45));
        inventario.agregarVehiculo(new Sedan("BMW", "Serie 3", 230));
        inventario.agregarVehiculo(new SUV("Ford", "Kuga", 60));
        inventario.agregarVehiculo(new Camion("Volvo", "FH16", 120));

        // Crear empleado
        Empleado empleado = new Empleado("Laura Gómez", 1);

        System.out.println("Bienvenido al Sistema de Alquiler de Vehículos");
        System.out.println("Atendido por: " + empleado.getNombre());

        inventario.mostrarDisponibles();

        System.out.print("\nIngrese el modelo del vehículo que desea alquilar: ");
        String modelo = sc.nextLine();

        Vehiculo vehiculoSeleccionado = inventario.buscarVehiculo(modelo);

        if (vehiculoSeleccionado == null) {
            System.out.println("❌ Vehículo no encontrado o no disponible.");
            return;
        }

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su DNI: ");
        String dni = sc.nextLine();

        Cliente cliente = new Cliente(nombre, dni);

        System.out.print("¿Cuántos días desea alquilarlo?: ");
        int dias = sc.nextInt();
        sc.nextLine(); // limpiar buffer

        Alquiler alquiler = new Alquiler(vehiculoSeleccionado, cliente, dias);
        System.out.println("Costo total: " + alquiler.calcularTotal() + "€");

        System.out.print("Método de pago (Tarjeta / Efectivo): ");
        String metodo = sc.nextLine();

        alquiler.realizarPago(metodo);

        System.out.println("\nGracias por usar nuestro sistema. ¡Buen viaje!");
        sc.close();
    }
}