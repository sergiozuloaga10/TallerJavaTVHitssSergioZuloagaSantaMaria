package tests;

import java.util.Scanner;

import clases.Jugador;
import clases.TorneoDeportivo;

public class TestMain {
    public static void main(String[] args) {
        TorneoDeportivo torneo = new TorneoDeportivo();
        Scanner sc = new Scanner(System.in);

        
        torneo.registrarJugador("futbol", new Jugador(1, "Carlos"));
        torneo.registrarJugador("futbol", new Jugador(2, "Ana"));
        torneo.registrarJugador("basquetbol", new Jugador(3, "Luis"));
        torneo.registrarJugador("basquetbol", new Jugador(2, "Ana")); // común
        torneo.registrarJugador("voleibol", new Jugador(4, "María"));

        int opcion;
        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Mostrar jugadores por deporte");
            System.out.println("2. Contar jugadores en cada disciplina");
            System.out.println("3. Fusionar equipos");
            System.out.println("4. Ver jugadores en común");
            System.out.println("5. Transferir jugador");
            System.out.println("6. Mostrar orden alfabético");
            System.out.println("7. Mostrar orden de inscripción");
            System.out.println("8. Ranking por ID");
            System.out.println("9. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Deporte: ");
                    String d = sc.nextLine();
                    torneo.mostrarJugadores(d);
                }
                case 2 -> torneo.contarJugadores();
                case 3 -> {
                    System.out.print("Deporte 1: ");
                    String d1 = sc.nextLine();
                    System.out.print("Deporte 2: ");
                    String d2 = sc.nextLine();
                    torneo.fusionarEquipos(d1, d2);
                }
                case 4 -> {
                    System.out.print("Deporte 1: ");
                    String d1 = sc.nextLine();
                    System.out.print("Deporte 2: ");
                    String d2 = sc.nextLine();
                    torneo.jugadoresComunes(d1, d2);
                }
                case 5 -> {
                    System.out.print("ID del jugador: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nombre del jugador: ");
                    String nombre = sc.nextLine();
                    System.out.print("Origen: ");
                    String origen = sc.nextLine();
                    System.out.print("Destino: ");
                    String destino = sc.nextLine();
                    torneo.transferirJugador(origen, destino, new Jugador(id, nombre));
                }
                case 6 -> torneo.mostrarOrdenAlfabetico();
                case 7 -> torneo.mostrarOrdenInscripcion();
                case 8 -> torneo.mostrarRankingPorID();
            }
        } while (opcion != 9);

        sc.close();
    }
}

