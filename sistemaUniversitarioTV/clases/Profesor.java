package clases;

import java.util.HashSet;
import java.util.Set;

public class Profesor {
    private int id;
    private String nombre;
    private Set<Curso> cursos = new HashSet<>();

    public Profesor(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public Set<Curso> getCursos() {
        return cursos;
    }
}