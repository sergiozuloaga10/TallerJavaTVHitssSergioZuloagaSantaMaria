package test;

import java.util.ArrayList;
import java.util.List;

import interfaces.MetodoPago;
import interfaces.Paypal;
import interfaces.TarjetaCredito;

public class Prueba {
    public static void main(String[] args) {
        List<MetodoPago> lista = new ArrayList<>();
        MetodoPago pago1 = new TarjetaCredito();
        MetodoPago pago2 = new Paypal();

        pago1.pago(2000);
        pago2.pago(2500);  
    }

}
