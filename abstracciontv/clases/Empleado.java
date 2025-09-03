package clases;

public abstract class Empleado {
    protected String nombre;
    protected double salario;
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    //Metodo de bono -> cada subclase lo implementara de manera especifica
    public abstract double calcularBono();

    //Metodo concreto
    public void mostrarInfo(){
        System.out.println("Empleado: " + nombre + " | Salario: $" + salario);
    }
}
