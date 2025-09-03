package test;

import clases.Desarrollador;
import clases.Empleado;
import clases.Gerente;
import clases.Vendedor;

public class TestMain {
    public static void main(String[] args) {
        //En una empresa existen distintos tipos de empleados, pero todos tienen nombre y salario,
        //pero el calculo de bonoificacion es diferente segun el tipo de empleado
        // ==> Gerente -> bonificacion del 20% sobre el salario
        // ==> Desarrollador -> bonificacion del 10% sobre su salario
        // ==> Vendedor -> bonificacion del 5% sobre sus ventas
        Empleado gerente = new Gerente("Eloy", 20000);
        Empleado dev = new Desarrollador("Angelica", 15000);
        Vendedor vendedor = new Vendedor("Bingo", 5000, 30000);

        System.out.println("===========Gerente===========");
        gerente.mostrarInfo();
        System.out.println("Bono: $" + gerente.calcularBono());

        System.out.println("===========Desarrollador===========");
        dev.mostrarInfo();
        System.out.println("Bono: $" + dev.calcularBono());

        System.out.println("===========Vendedor===========");
        vendedor.mostrarInfo();
        System.out.println("Bono: $" + vendedor.calcularBono());
    }
    
}
