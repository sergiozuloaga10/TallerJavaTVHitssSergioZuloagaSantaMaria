package clases;

public class Transaccion {

private static int contadorTransacciones = 1;
    private int id;
    private String tipo;
    private double monto;
    private int cuentaId;

    public Transaccion(String tipo, double monto, int cuentaId) {
        this.id = contadorTransacciones++;
        this.tipo = tipo;
        this.monto = monto;
        this.cuentaId = cuentaId;
    }

    @Override
    public String toString() {
        return "Transacción ID: " + id + ", Tipo: " + tipo + ", Monto: $" + monto + ", Cuenta ID: " + cuentaId;
    }
}
