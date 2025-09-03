package impl;

import interfaces.MetodoPago;

public class Paypal implements MetodoPago {

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con Paypal");
    }
    
}
