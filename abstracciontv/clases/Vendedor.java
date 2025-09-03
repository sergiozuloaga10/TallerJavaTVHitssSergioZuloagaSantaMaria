package clases;

public class Vendedor extends Empleado {

    private double totalVentas;
    public Vendedor(String nombre, double salario, double totalVentas) {
        super(nombre, salario);
        this.totalVentas = totalVentas;
    }
    
    @Override
    public double calcularBono() {
        // ==> Gerente -> bonificacion del 20% sobre el salario
        return totalVentas * 0.05;
    }
        
    
}
