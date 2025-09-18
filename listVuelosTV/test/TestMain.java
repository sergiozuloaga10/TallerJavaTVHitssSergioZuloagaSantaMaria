package test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.*;

import modelos.Vuelo;

public class TestMain {
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();

        // Simulación de los registros del Excel
        vuelos.add(new Vuelo("CMP 111", "Panama City", "CDMX",
                LocalDate.of(2021, 8, 31), LocalTime.of(15, 15), 150));
        vuelos.add(new Vuelo("AVA 241", "Bogota", "CDMX",
                LocalDate.of(2021, 8, 31), LocalTime.of(14, 45), 25));
        vuelos.add(new Vuelo("AMX 310", "Cancún", "CDMX",
                LocalDate.of(2021, 8, 31), LocalTime.of(12, 30), 180));
        vuelos.add(new Vuelo("LAN 401", "Lima", "CDMX",
                LocalDate.of(2021, 8, 31), LocalTime.of(13, 10), 90));

        // 1. Ordenar por fecha + hora
        vuelos.sort(Comparator.comparing(Vuelo::getFecha)
                .thenComparing(Vuelo::getHora));

        System.out.println("=== Listado ordenado por llegada ===");
        vuelos.forEach(System.out::println);

        // 2. Último vuelo en llegar
        Vuelo ultimo = Collections.max(vuelos,
                Comparator.comparing(Vuelo::getFecha)
                          .thenComparing(Vuelo::getHora));
        System.out.println("\nEl último vuelo en llegar es: " + ultimo);

        // 3. Vuelo con menor número de pasajeros
        Vuelo menorPasajeros = Collections.min(vuelos,
                Comparator.comparingInt(Vuelo::getPasajeros));
        System.out.println("El vuelo con menor número de pasajeros es: " + menorPasajeros);
    }
}

