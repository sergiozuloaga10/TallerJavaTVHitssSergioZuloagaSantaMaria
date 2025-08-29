package herencia;

import clases.Persona;

public class Estudiante extends Persona {
    private String carrera;

    public Estudiante(String name, int edad, String carrera) {
        super(name, edad);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
    
}
