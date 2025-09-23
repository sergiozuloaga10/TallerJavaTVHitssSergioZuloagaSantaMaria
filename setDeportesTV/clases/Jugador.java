package clases;

public class Jugador implements Comparable<Jugador> {
    private int id;
    private String nombre;

    public Jugador(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Jugador)) return false;
        Jugador other = (Jugador) obj;
        return id == other.id;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public int compareTo(Jugador o) {
        return this.nombre.compareToIgnoreCase(o.nombre);
    }
}
