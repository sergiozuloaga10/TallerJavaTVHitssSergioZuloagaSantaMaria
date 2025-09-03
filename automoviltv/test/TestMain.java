package test;

import abstracta.Vehiculo;
import subclases.Bus;
import subclases.Camion;
import subclases.Carro;

public class TestMain {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        Vehiculo toyota = new Carro("Toyota", "Corolla", 10000);
        Vehiculo autobus = new Bus("Mercedes", "Sprinter", 45000);
        Vehiculo tractoCamion = new Camion("Volvo", "FH-16", 70000);

        vehiculos[0] = toyota;
        vehiculos[1] = autobus;
        vehiculos[2] = tractoCamion;

        for (Vehiculo vehiculo : vehiculos) {
            System.out.println(vehiculo);
            System.out.println("Mantenimiento: $" + vehiculo.calcularMantenimiento());
        }
    }
}
