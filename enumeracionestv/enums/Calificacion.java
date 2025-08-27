package enums;

public enum Calificacion {
    A("Excelente"),
    B("Notable"),
    C("Aprobado"),
    D("Suficiente"),
    F("Reprobado");

    private final String descripcion;

    private Calificacion(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
}
