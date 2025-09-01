package clases;

public class Empleado extends Persona {
    private double remuneracion;
    private final int empleadoId;
    private static int contador;

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion,
                    double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++contador;
    }

    public double getRemuneracion() { return remuneracion; }
    public int getEmpleadoId()      { return empleadoId; }

    /** Aumenta la remuneración en el porcentaje indicado (por ejemplo, 10 = 10%). */
    public void aumentarRemuneracion(int porcentaje) {
        if (porcentaje < 0) throw new IllegalArgumentException("El porcentaje no puede ser negativo");
        remuneracion += remuneracion * (porcentaje / 100.0);
    }

    @Override
    public String toString() {
        return String.format(
            "Empleado{id=%d, remuneracion=%.2f, %s}",
            empleadoId, remuneracion, super.toString()
        );
    }
}
