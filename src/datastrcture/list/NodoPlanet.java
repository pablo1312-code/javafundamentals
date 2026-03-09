package oopmodeling;

import datastructure.list.NodoPlaneta;  // ← ESTA LÍNEA ES LA QUE FALTA
import oopmodeling.Planet;

public class LinkedListTest {
    public static void main(String[] args) {
        NodoPlaneta<Planet> primero = new NodoPlaneta<>(new Planet(10000, "Earth", 12311));
        // resto de tu código...
    }
}
