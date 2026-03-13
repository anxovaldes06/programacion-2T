package programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EjemploGato1 {


	
	public static void main ( String [] args) {
		
		ArrayList<MICHI> gateria = new ArrayList<MICHI>();
		
		gateria.add(new MICHI("garfield" , "naranja", "mestizo"));
		gateria.add(new MICHI("pepe", "gris" , "angora"));
		gateria.add(new MICHI("mauri", "blanco" , "manx"));
		gateria.add(new MICHI("ulises", "marrón" , "persa"));
		gateria.add(new MICHI("adán", "negro" , "angora"));
		
		
		
		Collections.sort(gateria);
		
		System.out.println("Datos de los gatos ordenados por nombre: \n");
		for (MICHI gatoAux : gateria) {
			System.out.println( gatoAux + "\n");
			
			
		}
	}
	
	
	
	
}
