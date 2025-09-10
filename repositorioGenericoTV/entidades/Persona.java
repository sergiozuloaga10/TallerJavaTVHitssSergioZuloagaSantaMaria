package entidades;

//record -> Java 16 -> para almacenar datos inmutables
//1. Inmutable por defecto -> los atributos son final
//2. Sintaxis reducida -> Mucho menos codigo
//3. Se usan para modelos de datos (DTOs, entidades simples, Respuestas de APIs, etc)
//4. implementan automaticamente: constructor, getters (con nombre del campo nombreCampo)
//equals(), hashCode() y toString()
//5. pueden tener metodos adicionales, validaciones en el constructor e interfaces implementadas

public record Persona(String nombre, int edad) {
    public Persona{
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad no debe ser menor o igual a cero.");
            //System.out.println("La edad no debe ser menor o igual a 0");
        }
    }

    public String mensaje(String cadena){
        return cadena;
    }
}
