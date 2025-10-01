package test;

import java.time.LocalDate;

import clases.Curso;
import clases.Estudiante;
import clases.Profesor;
import clases.SistemaUniversitario;

public class TestMain {
    public static void main(String[] args) {
        SistemaUniversitario sistema = new SistemaUniversitario();

        Profesor prof1 = new Profesor(1, "Dr. Gómez");
        sistema.agregarProfesor(prof1);

        Curso curso1 = new Curso("Matemáticas", prof1, LocalDate.of(2025, 1, 10), LocalDate.of(2025, 5, 10));
        Curso curso2 = new Curso("Física", prof1, LocalDate.of(2025, 3, 1), LocalDate.of(2025, 7, 1));
        sistema.agregarCurso(curso1);
        sistema.agregarCurso(curso2);

        Estudiante est1 = new Estudiante(101, "Ana");
        sistema.agregarEstudiante(est1);

        boolean ok1 = sistema.inscribirEstudiante("Matemáticas", 101);
        boolean ok2 = sistema.inscribirEstudiante("Física", 101); // conflicto de fechas

        System.out.println("Inscripción Matemáticas: " + ok1);
        System.out.println("Inscripción Física: " + ok2);

        System.out.println("\nCursos de Ana:");
        sistema.listarCursosDeEstudiante(101);

        System.out.println("\nCursos del Dr. Gómez:");
        sistema.listarCursosDeProfesor(1);

        System.out.println("\nCursos activos en 2025-04-01:");
        sistema.listarCursosActivosEn(LocalDate.of(2025, 4, 1));
    }
}