package interfaces.impl;

import interfaces.Factura;

public class FacturaNacional implements Factura{

    private double subtotal;
    private final double IVA;

    

    public FacturaNacional(double subtotal) {
        this.IVA = 0.16;
        this.subtotal = subtotal;
    }

    @Override
    public double calcularTotal() {
        return subtotal + subtotal * IVA;
    }

    @Override
    public String obtenerDetalles() {
        return "Factura Nacional - Subtotal: " + subtotal + " | Total: " + calcularTotal();
    }
    
}
