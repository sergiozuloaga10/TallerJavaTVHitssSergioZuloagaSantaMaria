package impl;

import interfaces.MetodoPago;

public class TarjetaCredito implements MetodoPago {

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con Tarjeta de credito");
    }
    
}
