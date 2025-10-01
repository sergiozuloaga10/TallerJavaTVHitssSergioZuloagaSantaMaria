import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ContadorPalabras {
    public static void main(String[] args) {
        // Expresión lambda que recibe una frase y devuelve el Map con la palabra más repetida
        Function<String, Map<String, Integer>> palabraMasRepetida = frase -> {
            // Dividir la frase en palabras
            String[] palabras = frase.toLowerCase().split("\\W+");

            // Contar ocurrencias
            Map<String, Long> conteo = Arrays.stream(palabras)
                    .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            // Encontrar la palabra más repetida
            Optional<Map.Entry<String, Long>> max = conteo.entrySet().stream()
                    .max(Map.Entry.comparingByValue());

            // Convertir a Map<String, Integer> como se pide
            Map<String, Integer> resultado = new HashMap<>();
            max.ifPresent(entry -> resultado.put(entry.getKey(), entry.getValue().intValue()));

            return resultado;
        };

        // Ejemplo de uso
        String frase = "Hola mundo hola hola mundo prueba prueba prueba";
        Map<String, Integer> resultado = palabraMasRepetida.apply(frase);

        // Mostrar resultado
        resultado.forEach((palabra, cantidad) ->
                System.out.println("Palabra más repetida: " + palabra + " (" + cantidad + " veces)")
        );
    }
}