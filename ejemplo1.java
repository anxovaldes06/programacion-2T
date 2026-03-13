package programacion2;

import java.util.ArrayList;

public class ejemplo1 {
	
	public static void main ( String [] args) {
		
		ArrayList<String> colores = new ArrayList<String>();
		
		System.out.println("\nNº de elementos : " +colores.size() );
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("amarilo");
		
		System.out.println("\nNº de elementos : " +colores.size());
		colores.add("blanco");
		
		System.out.println("\nNº de elementos : " +colores.size());
		
		System.out.println("\nEl elemento que hay en la posicion 0 es " +colores.get(0));
		System.out.println("El elemento que hay en la posicion 3 es " +colores.get(3));
		
		colores.forEach(colo -> System.out.println("El color es: " +colo + " y esta es la posicion : " +colores.indexOf(colo)));
		
		
		
	}
	

}
