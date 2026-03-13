package programacion2;

import java.util.ArrayList;

public class ejemplo3 {

	public static void main ( String [] args) {
		
		ArrayList<String> colores = new ArrayList<String>();
		
		colores.add("rojo");
		colores.add("verde");
		colores.add("rojo");
		colores.add("blanco");
		colores.add("amarillo");
		colores.add("blanco");
		
		System.out.println("Contenido de la lista");
		
		for ( String color : colores) {
			
			System.out.println(color);
			
		}
		
		if(colores.contains("blanco")) {
			System.out.println("El " +colores + " está en la lista de colores");
			
			
		}
		colores.remove("blanco");
		
		System.out.println("Contenido de la lista despues de quitar la primera ocurrencia del color blanco: ");
		
		for (String color : colores) {
			System.out.println(color);
			
		}
		colores.remove(2);
		
		System.out.println("Contenido de la lista después de quitar el elemnto de la posicion 2: ");
		for ( String color: colores) {
			System.out.println(color);
		}
		
		System.out.println("¡¡¡No hay elementos repetidos!!!");
		
	}
	
	
}
