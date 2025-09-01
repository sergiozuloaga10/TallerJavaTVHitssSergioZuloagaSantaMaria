package enums;

public enum Semaforo{
    //Una enumeracion para tener valores del semaforo (VERDE, AMARILLO, ROJO)
    //Cada constante debe implementar un metodo accion() , que te devuelve,
    // lo que debe hacer el conductor
    ROJO{
        @Override
        public String accion(){
            String cadena = "Detenerse";
            return cadena;
        }
    },
    AMARILLO{
        @Override
        public String accion(){
            String cadena = "Precaucion";
            return cadena;
        }
    },
    VERDE{
        @Override
        public String accion(){
            String cadena = "Avanzar";
            return cadena;
        }
    };

    //Metodo abstracto que cada constante debe implementar
    public abstract String accion();

}