package programacion2;

import java.util.ArrayList;

public class ejemplo4 {

	public static void main (String [] args) {
		
		ArrayList<String > colores = new ArrayList<String>();
	
		colores.add("rojo");
		colores.add("verde");
		colores.add("azul");
		colores.add("blanco");
		colores.add("amarillo");
		
		System.out.println("Contenido del vector: ");
		System.out.println(colores);
		
		colores.set(2, "turquesa");
		System.out.println("Contenido del vector despues de machacar la posición 2 : ");
		System.out.println(colores);
		
		colores.add(1,"ámbar");
		System.out.println("Nuevo contenido del vector en la posición 1 : ");
		System.out.println(colores);
	}
}
