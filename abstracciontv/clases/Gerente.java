package clases;

public class Gerente extends Empleado {

    public Gerente(String nombre, double salario) {
        super(nombre, salario);
    }

    @Override
    public double calcularBono() {
        // ==> Gerente -> bonificacion del 20% sobre el salario
        return salario * 0.20;
    }
    
}
