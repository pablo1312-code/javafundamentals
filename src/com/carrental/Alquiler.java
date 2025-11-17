package com.carrental;

/** Clase que representa una transacción de alquiler */
public class Alquiler {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int dias;
    private Pago pago;

    public Alquiler(Vehiculo vehiculo, Cliente cliente, int dias) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.dias = dias;
    }

    public double calcularTotal() {
        return vehiculo.calcularCosto(dias);
    }

    public void realizarPago(String metodo) {
        double total = calcularTotal();
        pago = new Pago(total, metodo);
        pago.mostrarPago();
        vehiculo.setDisponible(false);
        System.out.println("Vehículo alquilado correctamente a " + cliente.getNombre());
    }
}
