package subclases;

import abstractas.Canino;

public class Perro extends Canino {
    private int fuerzaMordida;

    public Perro(String habitat, float altura, float largo, float peso, String nombreCientifico,
                 String color, float tamanoColmillos, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillos);
        this.fuerzaMordida = fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro salvaje africano muerde con una fuerza de " + fuerzaMordida + " psi.";
    }

    @Override
    public String dormir() {
        return "El Perro duerme en madrigueras en " + habitat;
    }

    @Override
    public String correr() {
        return "El Perro corre en grupo para cazar.";
    }

    @Override
    public String comunicarse() {
        return "El Perro ladra y gruñe para comunicarse.";
    }
}

