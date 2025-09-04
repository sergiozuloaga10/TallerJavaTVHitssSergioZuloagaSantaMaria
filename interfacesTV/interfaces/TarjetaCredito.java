package interfaces;

public final class TarjetaCredito implements MetodoPago {

    @Override
    public void pago(double cantidad) {
        System.out.println("Pagando $" + cantidad + " con Tarjeta de credito");
    }
    
}
