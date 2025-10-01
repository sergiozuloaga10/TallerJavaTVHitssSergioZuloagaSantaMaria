package test;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class InterfaceFuncional {
    public static void main(String[] args) {
        //Predicate>T> -> recibe un argumento de tipo T, devuelve un boolean 
        //Uso: Validaciones o filtros
        Predicate<String> longitud = s -> s.length() > 5;
         System.out.println(longitud.test("Hola"));
          System.out.println(longitud.test("Programacion"));

        //Function<T, R> -> recibe un argumento de tipo T, devuelve un valor de tipo R
        //Uso: Mapear objetos a otros yipos -> DTO´s a entidades
        Function<String, Integer> tam = s -> s.length();
        System.out.println("Longitud: " + tam.apply("Sergio Zuloaga Santa Maria"));

        //Consumer<T> -> recibe un argumento de tipo T, no devuelve nada
        //Uso: imprimir, guardar en log, etc.
        Consumer<String> mayusculas = s-> System.out.println(s.toUpperCase());
        List<String> nombres = List.of("Eloy", "Sergio", "Kaory", "Otis");
        nombres.forEach(mayusculas);

        //Supplier<T> -> No recibe argumentos, devuelve un valor de tipo T
        //Uso: Generar valores bajo demanda, Generar ID
        Supplier<Integer> numero = () -> new Random().nextInt();
        
        System.out.println("Numero Aleatorio: " + numero.get());
        System.out.println("Numero Aleatorio: " + numero.get());
        System.out.println("Numero Aleatorio: " + numero.get());
        
        Supplier<String> codigo = () -> UUID.randomUUID().toString();
        System.out.println("ID: " + codigo.get());
        System.out.println("ID: " + codigo.get());
        System.out.println("ID: " + codigo.get());

        //BiPredicate<T, U> -> recibe dos argumentos (T, U), devuelve un valor de tipo boolean
        //Uso: Validaciones con dos entradas
        BiPredicate<String, Integer> evaluarCadena = (x, t) -> x.length() > t;
        System.out.println(evaluarCadena.test("Hola", 5));
        System.out.println(evaluarCadena.test("Programacion", 10));

        //BiFunction<T, U, R> -> Recibe dos argumentos (T, U), evuelve un valor de tipo
        //Uso: Operaciones matematicas, combinacion de objetos
        BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
        System.out.println("Multiplicacion: " + mul.apply(6, 10));

        //BiConsumer<String, Integer> -> recibe dos argumentos
        //Uso: Oprea
        BiConsumer<String, Integer> imprimir =
            (k, v) -> System.out.println(k + " tiene edad: " + v);

        Map<String, Integer> personas = 
            Map.of("Eloy", 40, "Susana", 35);

        personas.forEach(imprimir);

        //UnarryOperator, BinaryOperator -> son especiales de Function
        UnaryOperator<Integer> cuadrado = x -> x * x;
        System.out.println("Cuadrado: " + cuadrado.apply(5));

    }
}
