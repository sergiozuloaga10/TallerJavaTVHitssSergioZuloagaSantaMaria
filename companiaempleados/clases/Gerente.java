package clases;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion,
                   double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion);
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() { return presupuesto; }
    public void setPresupuesto(double presupuesto) {
        if (presupuesto < 0) throw new IllegalArgumentException("El presupuesto no puede ser negativo");
        this.presupuesto = presupuesto;
    }

    @Override
    public String toString() {
        return String.format(
            "Gerente{presupuesto=%.2f, %s}",
            presupuesto, super.toString()
        );
    }
}
