package programacion2;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio02 {
	
	
	public static void main (String [] argsg) {

	Scanner sc = new Scanner(System.in);
		
		
	HashMap<Integer,String> m = new HashMap<Integer,String>();
	
	m.put(120,"chorizo");
	m.put(210, "salami");
	m.put(50, "butifarra");
	m.put(100, "queso tetilla");
	m.put(930, "roquefort");
	m.put(70, "botifarra de perol");


	System.out.println(m.get(120));
	System.out.println(m.get(100));
	System.out.println(m.get(70));
	
	int clave = Integer.parseInt(sc.nextLine());
	if(m.containsKey(clave)) {
		System.out.println("corresponde a " +m.get(clave));
	}else {
		
		System.out.println("nadie con esa clave");
		
	}
		
	
	
	}
}
