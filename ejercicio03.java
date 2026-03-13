package programacion2;



import java.util.TreeMap; 
import java.util.Map;

public class ejercicio03 {
    public static void main(String[] args) {
     
        TreeMap<Integer, String> m = new TreeMap<>();
        
        m.put(120, "chorizo");
        m.put(210, "salami");
        m.put(50, "butifarra");
        m.put(100, "queso tetilla");
        m.put(930, "roquefort");
        m.put(70, "botifarra de perol");

        System.out.println("Entradas ordenadas por clave (de menor a mayor):");

        for (Map.Entry<Integer, String> pareja : m.entrySet()) {
            System.out.println(pareja.getKey() + " -> " + pareja.getValue());
        }
    }
}
