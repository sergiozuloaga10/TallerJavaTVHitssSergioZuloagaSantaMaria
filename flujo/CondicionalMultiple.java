package flujo;
//Alt + Flecha(Arriba o abajo) ---> mover codigo
//Shift + Alt + Flecha(abajo o arriba) ---> duplicar codigo
public class CondicionalMultiple {
    public static void main(String[] args) {
        int numero = 10;
        if(numero > 0){
            System.out.println("El número " + numero + " es positivo");
        } else if(numero < 0){
            System.out.println("El número " + numero + " es negativo");
        } else{
            System.out.println("El número " + numero + " es cero");
        }
    }
}
