package models;

public class Evaluacion {
    private String anio;
    private int puntaje;
    public Evaluacion(String anio, int puntaje) {
        this.anio = anio;
        this.puntaje = puntaje;
    }
    public String getAnio() {
        return anio;
    }
    public void setAnio(String anio) {
        this.anio = anio;
    }
    public int getPuntaje() {
        return puntaje;
    }
    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    @Override
    public String toString() {
        return "Evaluacion del año:" + anio + " - puntaje:" + puntaje;
    }

    
}
