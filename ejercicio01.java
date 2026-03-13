package programacion2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ejercicio01 {
	
	
	public static void main (String [] args) {
		
		HashMap<Integer,String> m = new HashMap<Integer,String>();
	
			m.put(120,"chorizo");
			
			if(m.containsKey(210)) {
			m.put(210, "salami");
			}
			
			
			
			m.put(50, "butifarra");
			m.put(100, "queso tetilla");
			m.put(930, "roquefort");
			m.put(70, "botifarra de perol");
			
			System.out.println("Los elementos de m son: \n" +m);
	
			
			for(  Map.Entry<Integer, String> par : m.entrySet() ) {
			System.out.println(par);	
			}
			
			
	
	}

}






































