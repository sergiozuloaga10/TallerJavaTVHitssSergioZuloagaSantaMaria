package interfaces;

public sealed interface MetodoPago permits TarjetaCredito, Paypal {
    //Java 17+
    //sealed interface -> restringe a las clases para implementar la interface
    //permits lista de clases y/o interfaces
    public void pago(double cantidad);
    
}
