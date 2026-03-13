package programacion2;

import java.util.ArrayList;

public class ejemplo6 {

	public static void main (String [] args) {
		
		ArrayList<String > colores = new ArrayList<String>();
	
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("blanco");
		colores.add("amarillo");
		
		System.out.println("Contenido de la lista: ");
		System.out.println(colores);
		
		colores.removeIf(palabra -> palabra.contains("a"));
		System.out.println("Contenido de la lista después de borrar las palabras que cotienen la letra \"a\" : ");
		System.out.println(colores);
		
		colores.add("azul");
		colores.add("blanco");
		colores.add("amarillo");
		System.out.println("Contenido de la lista: ");
		System.out.println(colores);
		
		colores.removeIf(palabra -> palabra.startsWith("a"));
		System.out.println("Contenido de la lista después de borrar las palabras que empiecen por  la letra \"a\" : ");
		System.out.println(colores);
	}
}
