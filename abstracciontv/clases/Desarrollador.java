package clases;

public class Desarrollador extends Empleado{

    public Desarrollador(String nombre, double salario) {
        super(nombre, salario);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calcularBono() {
        // ==> Gerente -> bonificacion del 20% sobre el salario
        return salario * 0.10;
    }
}
