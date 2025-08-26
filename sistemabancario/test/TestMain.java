package test;

import clases.*;

public class TestMain {
 public static void main(String[] args) {
        Banco banco = new Banco();

        CuentaBancaria ana = banco.crearCuenta("Ana", 5000);
        CuentaBancaria luis = banco.crearCuenta("Luis", 10000);

        banco.realizarDeposito(ana, 2000);
        banco.realizarRetiro(ana, 1000);

        banco.realizarRetiro(luis, 3000);
        banco.realizarDeposito(luis, 1500);

        banco.mostrarCuentas();
        banco.mostrarTransacciones();
    }

}
