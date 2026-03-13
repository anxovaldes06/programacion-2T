package programacion2;

import java.util.HashMap;
import java.util.Map;

public class ejercicio04 {
	
public static void main ( String [] args) {
	
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	
	 m.put(120, "chorizo");
     m.put(210, "salami");
     m.put(50, "butifarra");
     m.put(100, "queso tetilla");
     m.put(930, "roquefort");
     m.put(70, "botifarra de perol");

	System.out.println("hash no guarda el orden");
	System.out.println("Todas las entradas(PAREJAS) del diccionario extraidas con entrySet:");
	System.out.println(m.entrySet());
	
	
	
	System.out.println("para verlo ordenado sin usar TREE puedo usar la api stream para hacer un recorrido...");
	m.entrySet()
	.stream()
	.sorted(Map.Entry.comparingByKey())
	.forEach(entry -> System.out.println( entry.getKey() + " : " + entry.getValue()));
}	
	
	
	
}
