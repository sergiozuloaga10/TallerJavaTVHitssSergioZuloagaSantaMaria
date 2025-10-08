package test;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import models.Empleado;
import models.Evaluacion;

public class SistemaRecursosHumanos {
    public static void main(String[] args) {
        // Creamos 5 empeados:
        Empleado e1 = new Empleado(1, "Sergio", "TI", 20000, "3");
        Empleado e2 = new Empleado(2, "Kaory", "TI", 8000, "1");
        Empleado e3 = new Empleado(3, "Juana", "Ventas", 18000, "7");
        Empleado e4 = new Empleado(4, "Fernando", "Soporte", 12000, "4");
        Empleado e5 = new Empleado(5, "Bingo", "Marketing", 19000, "6");

        //agregamos evaluaciones

        //e1
        e1.agregarEvaluacion(new Evaluacion("2024", 80));
        e1.agregarEvaluacion(new Evaluacion("2025", 93));
        //e2
        e2.agregarEvaluacion(new Evaluacion("2025", 90));
        //e3
        e3.agregarEvaluacion(new Evaluacion("2020", 88));
        e3.agregarEvaluacion(new Evaluacion("2021", 90));
        e3.agregarEvaluacion(new Evaluacion("2022", 95));
        e3.agregarEvaluacion(new Evaluacion("2023", 91));
        e3.agregarEvaluacion(new Evaluacion("2024", 80));
        e3.agregarEvaluacion(new Evaluacion("2025", 90));
        //e4
        e4.agregarEvaluacion(new Evaluacion("2023", 79));
        e4.agregarEvaluacion(new Evaluacion("2024", 87));
        e4.agregarEvaluacion(new Evaluacion("2025", 85));
        //e5
        e5.agregarEvaluacion(new Evaluacion("2021", 81));
        e5.agregarEvaluacion(new Evaluacion("2022", 86));
        e5.agregarEvaluacion(new Evaluacion("2023", 84));
        e5.agregarEvaluacion(new Evaluacion("2024", 90));
        e5.agregarEvaluacion(new Evaluacion("2025", 88));

        // 1. Listar todos los empleados de un departamento especifico:
        List<Empleado> empleados = List.of(e1, e2, e3, e4, e5);
        empleados.stream().filter(e -> e.getDepartamento().equalsIgnoreCase("TI"))
                        .sorted(Comparator.comparing(Empleado::getNombre)).collect(Collectors.toList()).forEach(System.out::println);

        // 2. Calcular el salario promedio por departamento
        System.out.println("\n2. Salaro promedio por departamento");
        empleados.stream()
            .collect(Collectors.groupingBy(
                    Empleado::getDepartamento,
                    Collectors.averagingDouble(Empleado::getSalario)
                ))
            .forEach((dep, avg) -> System.out.println(dep + ": $" + avg));

        
       
        // 3. Empleado con mayor salario
        System.out.println("\n3. Empleado con mayor salario:");
        empleados.stream()
            .max(Comparator.comparingDouble(Empleado::getSalario))
            .ifPresent(System.out::println);

        // 4. Empleados con >5 años experiencia y salario >50,000
        System.out.println("\n4. Empleados con >5 años de experiencia y salario >50,000:");
        empleados.stream()
            .filter(e -> Integer.parseInt( e.getAniosExperiencia()) > 5 && e.getSalario() > 50000)
            .forEach(System.out::println);

        // 5. Top 3 empleados con mejor puntaje en última evaluación (2023)
        System.out.println("\n5. Top 3 empleados por evaluación 2023:");
        empleados.stream()
            .filter(e -> e.getHistorialEvaluaciones().stream().anyMatch(ev -> ev.getAnio().equals("2023")))
            .sorted((s1, s2) -> Integer.compare(
                getPuntajePorAnio(s2, "2025"),
                getPuntajePorAnio(s1, "2025")
            ))
            .limit(3)
            .forEach(System.out::println);

        // 6. Contar empleados con al menos una evaluación >90
        long count = empleados.stream()
            .filter(e -> e.getHistorialEvaluaciones().stream().anyMatch(ev -> ev.getPuntaje() > 90))
            .count();
        System.out.println("\n6. Empleados con evaluación >90: " + count);

        // 7. Ranking de promedio de puntajes por empleado
        System.out.println("\n7. Ranking de promedio de puntajes:");
        empleados.stream()
            .sorted((s1, s2) -> Double.compare(
                promedio(s2.getHistorialEvaluaciones()),
                promedio(s1.getHistorialEvaluaciones())
            ))
            .forEach(e -> System.out.println(e.getNombre() + ": " + promedio(e.getHistorialEvaluaciones())));
    }

    private static int getPuntajePorAnio(Empleado e, String anio) {
        return e.getHistorialEvaluaciones().stream()
                .filter(ev -> ev.getAnio().equals(anio))
                .mapToInt(Evaluacion::getPuntaje)
                .findFirst()
                .orElse(0);
    }

    private static double promedio(List<Evaluacion> evaluaciones) {
        return evaluaciones.stream().mapToInt(Evaluacion::getPuntaje).average().orElse(0);
    }

}
