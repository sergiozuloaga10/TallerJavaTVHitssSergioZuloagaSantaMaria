package clases;

public class Persona {
    private final String nombre;
    private final String apellido;
    private final String numeroFiscal;
    private final String direccion;

    public Persona(String nombre, String apellido, String numeroFiscal, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroFiscal = numeroFiscal;
        this.direccion = direccion;
    }

    public String getNombre()        { return nombre; }
    public String getApellido()      { return apellido; }
    public String getNumeroFiscal()  { return numeroFiscal; }
    public String getDireccion()     { return direccion; }

    @Override
    public String toString() {
        return String.format(
            "Persona{nombre='%s', apellido='%s', numeroFiscal='%s', direccion='%s'}",
            nombre, apellido, numeroFiscal, direccion
        );
    }
}