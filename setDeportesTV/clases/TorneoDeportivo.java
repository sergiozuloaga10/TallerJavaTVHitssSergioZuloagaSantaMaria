package clases;

import java.util.*;

public class TorneoDeportivo {
    private Map<String, Set<Jugador>> deportes = new HashMap<>();
    private Map<String, LinkedHashSet<Jugador>> ordenInscripcion = new HashMap<>();

    public void registrarJugador(String deporte, Jugador jugador) {
        deportes.putIfAbsent(deporte, new HashSet<>());
        ordenInscripcion.putIfAbsent(deporte, new LinkedHashSet<>());
        if (deportes.get(deporte).add(jugador)) {
            ordenInscripcion.get(deporte).add(jugador);
        }
    }

    public void mostrarJugadores(String deporte) {
        Set<Jugador> jugadores = deportes.get(deporte);
        if (jugadores != null) {
            for (Jugador j : jugadores) {
                System.out.println(j.getId() + " - " + j.getNombre());
            }
        }
    }

    public void contarJugadores() {
        for (String deporte : deportes.keySet()) {
            System.out.println(deporte + ": " + deportes.get(deporte).size() + " jugadores");
        }
    }

    public void fusionarEquipos(String d1, String d2) {
        Set<Jugador> fusion = new HashSet<>(deportes.getOrDefault(d1, Set.of()));
        fusion.addAll(deportes.getOrDefault(d2, Set.of()));
        fusion.forEach(j -> System.out.println(j.getId() + " - " + j.getNombre()));
    }

    public void jugadoresComunes(String d1, String d2) {
        Set<Jugador> comunes = new HashSet<>(deportes.getOrDefault(d1, Set.of()));
        comunes.retainAll(deportes.getOrDefault(d2, Set.of()));
        comunes.forEach(j -> System.out.println(j.getId() + " - " + j.getNombre()));
    }

    public void transferirJugador(String origen, String destino, Jugador jugador) {
        if (deportes.getOrDefault(origen, Set.of()).remove(jugador)) {
            registrarJugador(destino, jugador);
        }
    }

    public void mostrarOrdenAlfabetico() {
        TreeSet<Jugador> ordenados = new TreeSet<>();
        deportes.values().forEach(ordenados::addAll);
        ordenados.forEach(j -> System.out.println(j.getId() + " - " + j.getNombre()));
    }

    public void mostrarOrdenInscripcion() {
        ordenInscripcion.values().forEach(bolsa -> {
            for (Jugador j : bolsa) {
                System.out.println(j.getId() + " - " + j.getNombre());
            }
        });
    }

    public void mostrarRankingPorID() {
        TreeSet<Jugador> ranking = new TreeSet<>(Comparator.comparingInt(Jugador::getId));
        deportes.values().forEach(ranking::addAll);
        ranking.forEach(j -> System.out.println(j.getId() + " - " + j.getNombre()));
    }
}

