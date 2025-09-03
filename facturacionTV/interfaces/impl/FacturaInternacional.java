package interfaces.impl;

import interfaces.Factura;

public class FacturaInternacional implements Factura{

    private double subtotal;
    private final double TAX;

    

    public FacturaInternacional(double subtotal) {
        this.TAX = 0.10;
        this.subtotal = subtotal;
    }

    @Override
    public double calcularTotal() {
        return subtotal + subtotal * TAX;
    }

    @Override
    public String obtenerDetalles() {
        return "Factura Interacional - Subtotal: " + subtotal + " | Total: " + calcularTotal();
    }
    
}
