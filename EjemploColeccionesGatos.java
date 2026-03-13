package programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploColeccionesGatos {


	
	public static void main ( String [] args) {
		
		List<MICHI> gateria = new ArrayList<MICHI>();
		
		gateria.add(new MICHI("garfield" , "naranja", "mestizo"));
		gateria.add(new MICHI("pepe", "gris" , "angora"));
		gateria.add(new MICHI("mauri", "blanco" , "manx"));
		gateria.add(new MICHI("ulises", "marrón" , "persa"));
		gateria.add(new MICHI("adán", "negro" , "angora"));
		
		System.out.println("---Lista inicial ---\n " +gateria);
		
		Collections.sort(gateria);
		
		System.out.println("--- Ordenador(A-Z) ---\n " +gateria);
		
		
		Collections.reverse(gateria);
		
		System.out.println("--- Ordenador(Z-A) ---\n " +gateria);
		
		Collections.shuffle(gateria);
		System.out.println("---Gatos tras el shuffle ---\n " +gateria);

		
		MICHI primero = Collections.min(gateria);
		MICHI ultimo = Collections.max(gateria);
		
		System.out.println("El primero alfabeticamente es : " +primero.getNombre());
		System.out.println("El último alfabeticamente es : " +ultimo.getNombre());
		
		
		int numGarfield = Collections.frequency(gateria, new MICHI ("garfield","",""));
		System.out.println("\n Número de Garfields : " +numGarfield);
		
		Collections.replaceAll(gateria, new MICHI("garfield","",""), new MICHI("pepe","",""));
		
		System.out.println("\n --- Tras el ReplaceAll --- \n " +gateria);
		
		Collections.sort(gateria);
		
		int pos = Collections.binarySearch(gateria, new MICHI("ulises","",""));
		System.out.println("Ulises está en la posición : " +pos);
		
		
		List<MICHI> listaBlindada = Collections.unmodifiableList(gateria);
		
		
	}
	
	
	
	
}
