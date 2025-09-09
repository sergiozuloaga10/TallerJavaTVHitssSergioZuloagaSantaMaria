package genericos;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.set("Factura...");
        System.out.println("Caja de texto contiene: " + cajaTexto.get());
        
        Caja<Integer> cajaEntero = new Caja<>();
        cajaEntero.set(234);
        System.out.println("Caja de entero contiene: " + cajaEntero.get());
    }


}
