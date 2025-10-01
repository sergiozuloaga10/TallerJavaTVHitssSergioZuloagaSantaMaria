package clases;

import java.time.LocalDate;
import java.util.*;

public class SistemaUniversitario {
    private Map<String, Curso> cursos = new HashMap<>();
    private Map<Integer, Estudiante> estudiantes = new HashMap<>();
    private Map<Integer, Profesor> profesores = new HashMap<>();
    private Map<Integer, Set<Curso>> cursosPorEstudiante = new HashMap<>();

    public void agregarCurso(Curso curso) {
        cursos.put(curso.getNombre(), curso);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.put(estudiante.getId(), estudiante);
        cursosPorEstudiante.put(estudiante.getId(), new HashSet<>());
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.put(profesor.getId(), profesor);
    }

    public boolean inscribirEstudiante(String nombreCurso, int idEstudiante) {
        Curso curso = cursos.get(nombreCurso);
        Estudiante estudiante = estudiantes.get(idEstudiante);
        Set<Curso> actuales = cursosPorEstudiante.get(idEstudiante);

        if (curso != null && estudiante != null) {
            boolean inscrito = curso.inscribirEstudiante(estudiante, actuales);
            if (inscrito) {
                actuales.add(curso);
            }
            return inscrito;
        }
        return false;
    }

    public void retirarEstudiante(String nombreCurso, int idEstudiante) {
        Curso curso = cursos.get(nombreCurso);
        Estudiante estudiante = estudiantes.get(idEstudiante);
        if (curso != null && estudiante != null) {
            curso.retirarEstudiante(estudiante);
            cursosPorEstudiante.get(idEstudiante).remove(curso);
        }
    }

    public void listarCursosDeEstudiante(int idEstudiante) {
        Set<Curso> lista = cursosPorEstudiante.get(idEstudiante);
        if (lista != null) {
            lista.forEach(c -> System.out.println(c.getNombre()));
        }
    }

    public void listarCursosDeProfesor(int idProfesor) {
        Profesor profesor = profesores.get(idProfesor);
        if (profesor != null) {
            profesor.getCursos().forEach(c -> System.out.println(c.getNombre()));
        }
    }

    public void listarCursosActivosEn(LocalDate fecha) {
        cursos.values().stream()
                .filter(c -> c.estaActivoEn(fecha))
                .forEach(c -> System.out.println(c.getNombre()));
    }
}