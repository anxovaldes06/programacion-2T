package programacion2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class propuesto2 {
	
	 public static void main ( String [] args) {
		 
	Scanner sc = new Scanner ( System.in);
		 
	HashMap<String, String> diccionario = new HashMap<String, String>();

	diccionario.put("manzana", "apple");    
	diccionario.put("casa", "house");      
	diccionario.put("coche", "car");       
	diccionario.put("libro", "book");       
	diccionario.put("perro", "dog");       
	diccionario.put("agua", "water");      

	diccionario.put("sol", "sun");       
	diccionario.put("luna", "moon");        
	diccionario.put("árbol", "tree");       
	diccionario.put("leche", "milk");       
	diccionario.put("fuego", "fire");     
	diccionario.put("estrella", "star");  
	
	
	System.out.println("--- CONTENIDO DEL DICCIONARIO ---");
	for(Map.Entry<String, String> entrada : diccionario.entrySet()) {
	System.out.println(entrada.getKey()+ " en inglés es " +entrada.getValue());
		
	}
	boolean encontrado;
	do {
	System.out.println("\nIntroduzca palabra a buscar : ");
	String buscar = sc.nextLine();
	encontrado = true;

	if(diccionario.containsKey(buscar)) {
	System.out.println("\nBúsqueda de " +buscar + " : " +diccionario.get(buscar));
	
	 }else {
	System.out.println("\nEse término no está en el diccionario");	 
		break;
	 }
	}while(encontrado ==true);	 
	
	 
	 }
}
