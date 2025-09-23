package impl;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapaLinkedHashMap {
    public static void main(String[] args) {
        Map<String, String> nombres = new LinkedHashMap<>();
        nombres.put("eloy", "Eloy Sanchez");
        nombres.put("sergio", "Sergio Zuloaga");
        nombres.put(null, null);
        nombres.put("bingo", "Bingo Ruiz");
        //nombres.put("sergio", "Sergio Zuloaga");
        System.out.println("Nombres: " + nombres);
    }
}
