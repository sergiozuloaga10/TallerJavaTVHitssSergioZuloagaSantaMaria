package subclases;

import abstractas.Felino;

public class Guepardo extends Felino {
    public Guepardo(String habitat, float altura, float largo, float peso, String nombreCientifico,
                    float tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() {
        return "El Guepardo caza con velocidad en " + habitat;
    }

    @Override
    public String dormir() {
        return "El Guepardo descansa en las sabanas de " + habitat;
    }

    @Override
    public String correr() {
        return "El Guepardo corre a " + velocidad + " km/h, el más rápido de los mamíferos terrestres.";
    }

    @Override
    public String comunicarse() {
        return "El Guepardo emite sonidos agudos para comunicarse.";
    }
}
