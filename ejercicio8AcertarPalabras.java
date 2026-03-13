package programacion2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class ejercicio8AcertarPalabras {
	
	static HashMap<String,String> diccionario;

public static HashMap<String,String> generaDiccionario(){
	
	  diccionario = new HashMap();
	
	
	 
	

	  diccionario.put("residencia", "residence");
	  diccionario.put("vehículo", "automobile");
	  diccionario.put("volumen", "tome");
	  diccionario.put("canino", "canine");
	  diccionario.put("líquido", "liquid");
	  diccionario.put("astro", "celestial body");
	  diccionario.put("satélite", "satellite");
	  diccionario.put("arboleda", "woodland");
	  diccionario.put("lácteo", "dairy");
	  diccionario.put("combustión", "combustion");
	  diccionario.put("constelación", "constellation");
	  diccionario.put("fructosa", "fructose");
	
	System.out.println("--- CONTENIDO DEL DICCIONARIO ---");
	for(Map.Entry<String, String> entrada : diccionario.entrySet()) {
	System.out.println(entrada.getKey()+ " en inglés es " +entrada.getValue());

	}
	
	return diccionario;
}

public static void main (String[] args) {
	
	Scanner sc = new Scanner ( System.in);
	generaDiccionario();
	
	System.out.println(diccionario.keySet());
	
	String [] palabras =  diccionario.keySet().toArray(new String [0]);
	
	int cont = 0;
	for ( int i = 0; i < 5 ; i++) {
		int indice = new Random().nextInt(palabras.length);
		String palabra = palabras[indice];
		System.out.println("Traduce la siguiente palabra al ingles: " +palabra);
		
		String respuesta = sc.nextLine();
		if(respuesta.equals(diccionario.get(palabra))) {
			cont++;
		}
		
		System.out.println("Has acertado " +cont+ " palabras");
		
		
	}
	
	
	
}
	
	
	
}
