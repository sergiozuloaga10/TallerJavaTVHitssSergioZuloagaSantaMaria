package models;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private int id;
    private String nombre;
    private String departamento;
    private double salario;
    private String aniosExperiencia;
    private List<Evaluacion> historialEvaluaciones;

    public Empleado(int id, String nombre, String departamento, double salario, String aniosExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.departamento = departamento;
        this.salario = salario;
        this.aniosExperiencia = aniosExperiencia;
        this.historialEvaluaciones = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getAniosExperiencia() {
        return aniosExperiencia;
    }
    public void setAniosExperiencia(String aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public List<Evaluacion> getHistorialEvaluaciones() {
        return historialEvaluaciones;
    }

    public void agregarEvaluacion(Evaluacion evaluacion) {
        historialEvaluaciones.add(evaluacion);
    }

    @Override
    public String toString() {
        return "Empleado {id:" + id + ", nombre:" + nombre + ", departamento:" + departamento + ", salario:" + salario
                + ", aniosExperiencia:" + aniosExperiencia + ", historialEvaluaciones:" + historialEvaluaciones + "}";
    }

}
