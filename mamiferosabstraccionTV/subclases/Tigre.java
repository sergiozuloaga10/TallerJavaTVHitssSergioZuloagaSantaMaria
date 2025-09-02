package subclases;

import abstractas.Felino;

public class Tigre extends Felino {
    private String especieTigre;

    public Tigre(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 float tamanoGarras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especieTigre = especieTigre;
    }

    @Override
    public String comer() {
        return "El Tigre de especie " + especieTigre + " caza en solitario en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Tigre duerme entre la vegetación de " + habitat;
    }

    @Override
    public String correr() {
        return "El Tigre corre a " + velocidad + " km/h para emboscar a su presa.";
    }

    @Override
    public String comunicarse() {
        return "El Tigre ruge para marcar su territorio.";
    }
}
