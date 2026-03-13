package programacion2;

import java.util.HashMap;
import java.util.Scanner;

public class PuntuacionMano {
	
	public static HashMap<String,Integer> puntos  = new HashMap<String,Integer>();
	
	
	public static void main (String [] args) {
		
		puntos.put("dos", 0);
		puntos.put("seis", 0);
		puntos.put("cuatro", 0);
		puntos.put("cinco", 0);
		puntos.put("siete", 0);
		puntos.put("tres", 10);
		puntos.put("rey", 4);
		puntos.put("as", 11);
		puntos.put("sota", 2);
		puntos.put("caballo",3);

		Scanner sc = new Scanner(System.in);
		
		int sumar = 0;
		int contador = 0;
		do {
			System.out.println("\nIntroduzca el nombre de su carta : ");
			String carta = sc.nextLine().toLowerCase();
		if(puntos.containsKey(carta)) {
			contador++;
			System.out.println("\nla carta " + carta + " suma : " +puntos.get(carta) + " puntos ");
			sumar+=puntos.get(carta);
			
		}else if(!puntos.containsKey(carta)){
			System.out.println("\ncarta no encontrada");
			
		}
		}while(contador <5);
		System.out.println("\nTotal de puntos : " +sumar);
		
	}
	

	
	
}
