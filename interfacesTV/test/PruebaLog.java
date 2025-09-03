package test;

import impl.LoggerConsola;
import interfaces.Logger;

public class PruebaLog {
    public static void main(String[] args) {
        Logger logger = new LoggerConsola();
        logger.log("Aplicacion iniciada");
        logger.info("Iniciando el metodo main");
        logger.error("Ocurrio un error en el sistema");
    }
}
