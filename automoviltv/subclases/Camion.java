package subclases;

import abstracta.Vehiculo;

public class Camion extends Vehiculo {

    public Camion(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
        return 1500 + kilometros * 0.30;
    }
    
}
