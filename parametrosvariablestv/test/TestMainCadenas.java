package test;

public class TestMainCadenas {
    //concatenar cadenas de texto (+), StringBuilder
    private static String concatenar(String ... cadenas){
        StringBuilder sb = new StringBuilder();
        for(String cadena : cadenas){
            sb.append(cadena).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(concatenar("Hola"));
        System.out.println(concatenar("Hola", "mundo", "desde", "Java", "21", ",", "Empezamos ya"));
        System.out.println(concatenar());

    }
}
