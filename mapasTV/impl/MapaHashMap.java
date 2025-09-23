package impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapaHashMap {
    public static void main(String[] args) {
        //Map<K, V>
        Map<Integer, String> frutas = new HashMap<>();
        frutas.put(3, "Manzana");
        frutas.put(2, "Uvas");
        frutas.put(6, "Melon");
        frutas.put(4, "Sandia");
        frutas.put(5, "Fresas");
        System.out.println("Frutas: " + frutas);
        frutas.put(3, "Mango");
        System.out.println("Frutas: " + frutas);
        frutas.put(null, "Fruta desconocida");
        System.out.println("Frutas: " + frutas);
        frutas.put(8, null);
        frutas.put(10, null);
        System.out.println("Frutas: " + frutas);

        //Recorrer un mapa y obtener clave-valor
        Set<Entry<Integer, String>> elementos = frutas.entrySet();
        for (Map.Entry<Integer, String> elemento : elementos) {
            System.out.println(elemento.getKey() + " --> " +elemento.getValue());
        }

        //Recorrer un mapa y obtener solo claves
        System.out.println("Recorriendo mapa y obtener las claves");
        Set<Integer> claves = frutas.keySet();
        for (Integer clave : claves) {
            System.out.println("Clave: " + clave);
        }

        //Recorrer un mapa y obtener solo los valores
        System.out.println( "Recorriendo un mapa y obtener los valores");
        List<String> valores = new ArrayList<>(frutas.values());
        for (String valor : valores) {
            System.out.println("Valores: " + valor);
        }

        // Map<Integer, List<String>> elements = new HashMap<>();
    }
}
