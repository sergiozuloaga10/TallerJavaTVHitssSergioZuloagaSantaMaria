package clases;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Curso {
    private String nombre;
    private Profesor profesor;
    private LocalDate inicio;
    private LocalDate fin;
    private Set<Estudiante> estudiantes = new HashSet<>();

    public Curso(String nombre, Profesor profesor, LocalDate inicio, LocalDate fin) {
        this.nombre = nombre;
        this.profesor = profesor;
        this.inicio = inicio;
        this.fin = fin;
        profesor.agregarCurso(this);
    }

    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    public LocalDate getInicio() { return inicio; }
    public LocalDate getFin() { return fin; }
    public Set<Estudiante> getEstudiantes() { return estudiantes; }

    public boolean inscribirEstudiante(Estudiante estudiante, Set<Curso> cursosActuales) {
        for (Curso c : cursosActuales) {
            if (fechasSolapadas(c)) {
                return false;
            }
        }
        return estudiantes.add(estudiante);
    }

    public void retirarEstudiante(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    private boolean fechasSolapadas(Curso otro) {
        return !(fin.isBefore(otro.inicio) || inicio.isAfter(otro.fin));
    }

    public boolean estaActivoEn(LocalDate fecha) {
        return !fecha.isBefore(inicio) && !fecha.isAfter(fin);
    }
}

