package modelos;

import java.time.LocalDate;
import java.time.LocalTime;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private LocalDate fecha;
    private LocalTime hora;
    private int pasajeros;

    public Vuelo(String nombre, String origen, String destino,
                 LocalDate fecha, LocalTime hora, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fecha = fecha;
        this.hora = hora;
        this.pasajeros = pasajeros;
    }

    public String getNombre() { return nombre; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public LocalDate getFecha() { return fecha; }
    public LocalTime getHora() { return hora; }
    public int getPasajeros() { return pasajeros; }

    @Override
    public String toString() {
        return String.format("%s: %s → %s, %s %s, %d pasajeros",
                nombre, origen, destino, fecha, hora, pasajeros);
    }
}

