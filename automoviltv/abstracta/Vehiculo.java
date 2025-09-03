package abstracta;

public abstract class Vehiculo{
    protected String marca;
    protected String modelo;
    protected int kilometros;

    public Vehiculo(String marca, String modelo, int kilometros) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
    }

    public abstract double calcularMantenimiento();

    @Override
    public String toString() {
        return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", kilometros=" + kilometros + "]";
    }

    
}