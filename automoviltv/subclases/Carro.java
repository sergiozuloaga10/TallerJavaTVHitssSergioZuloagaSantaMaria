package subclases;

import abstracta.Vehiculo;

public class Carro extends Vehiculo {

    public Carro(String marca, String modelo, int kilometros) {
        super(marca, modelo, kilometros);
    }

    @Override
    public double calcularMantenimiento() {
       return 500  + kilometros * 0.10;
    }
    
}
