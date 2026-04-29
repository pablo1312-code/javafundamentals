package examen;

public class algoritmo {
    public static boolean esCreciente(int[] numeros) {
        for (int i = 0; i < numeros.length - 1; i++) {
            if (numeros[i] > numeros[i + 1]) {
                return false;
                
            }
        }
        return true;
    }
}
 




