package programacion2;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {

	public static void main (String [] args) {
		List<String> compis = new ArrayList<String>();
		compis.add("Yelmilena P");
		compis.add("Jorge F");
		compis.add("Laura S");
		compis.add("Anxo Fo");
		compis.add("Carla C");
		compis.add("Manuel C");
		
		System.out.println("conforENHANCED\n");
		
		for( String puntero : compis) {
			System.out.println(puntero );		
		}
		System.out.println("\n");
		
		System.out.println("conforEACH\n");
		compis.forEach(puntero -> System.out.println(puntero));
		
	}
	
	
	
}
