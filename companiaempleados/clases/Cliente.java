package clases;

public class Cliente extends Persona {
    private final int clienteId;
    private static int contador;

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++contador;
    }

    public int getClienteId() { return clienteId; }

    @Override
    public String toString() {
        return String.format(
            "Cliente{id=%d, %s}",
            clienteId, super.toString()
        );
    }
}