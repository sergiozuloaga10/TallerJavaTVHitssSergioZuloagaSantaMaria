package test;

import clases.Gerente;

public class TestMain {
    public static void main(String[] args) {
        Gerente g = new Gerente(
                "Sergio", "Zuloaga", "XAXX010101000", "CDMX",
                120_000.00,            // remuneracion, empleadoId
                850_000.00                  // presupuesto
        );

        System.out.println("=== Datos iniciales del gerente ===");
        System.out.println(g); // toString con heredados

        g.aumentarRemuneracion(10); // +10% de aumento
        g.setPresupuesto(1_000_000.00);

        System.out.println("\n=== Después del aumento y ajuste de presupuesto ===");
        System.out.println(g);
    }
}