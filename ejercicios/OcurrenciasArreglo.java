package ejercicios;

import java.util.HashMap;
import java.util.Map;

public class OcurrenciasArreglo {
    public static void main(String[] args) {
        int[] arreglo = {1,2,3,3,4,5,5,5,6,7,7,7,7,7,7};
        
        Map<Integer, Integer> contador = new HashMap<>();

        // Contar ocurrencias
        for (int num : arreglo) {
            contador.put(num, contador.getOrDefault(num, 0) + 1);
        }

        int maxOcurrencias = 0;
        int elementoMasRepetido = -1;

        // Encontrar el número con más ocurrencias
        for (Map.Entry<Integer, Integer> entry : contador.entrySet()) {
            if (entry.getValue() > maxOcurrencias) {
                maxOcurrencias = entry.getValue();
                elementoMasRepetido = entry.getKey();
            }

        }

        System.out.println("1. La mayor ocurrencias es: " + maxOcurrencias);
        System.out.println("2. El elemento que más se repite es: " + elementoMasRepetido);

    }
}
