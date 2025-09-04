package interfaces;

public final class Paypal implements MetodoPago {

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con Paypal");
    }
    
}
