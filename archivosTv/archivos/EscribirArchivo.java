package archivos;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class EscribirArchivo {
    public static void main(String[] args) {
        Path ruta = Paths.get("ejemplo.txt");
        String contenido = "Hola estoy escrito en un archivo";

        try {
            Files.writeString(ruta, contenido, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            System.out.println("Texto escrito en el archivo");
        } catch (Exception e) {
            // TODO: handle exception
            e.getMessage();
        }
    }
}
