package programacion2;

import java.util.ArrayList;

public class ejemplo7 {

	public static void main (String [] args) {
		
		ArrayList<Integer > numeros = new ArrayList<Integer>();
	
		numeros.add(20);
		numeros.add(7);
		numeros.add(14);
		numeros.add(32);
		numeros.add(3);
		
		System.out.println("Contenido de la lista: ");
		System.out.println(numeros);
		
		numeros.removeIf(numero -> numero <10);
		System.out.println("Contenido de la lista después de quitar las números menores de 10 : ");
		System.out.println(numeros);
		
		
		
		
	}
}
