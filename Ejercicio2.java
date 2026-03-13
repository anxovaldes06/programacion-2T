package programacion2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ejercicio2 {

	public static void main ( String [] args) {
		
		Random mero = new Random ();
		
		int elementos = mero.nextInt(11)+10; 
		System.out.println("EL NÚMERO DE ELEMENTOS DE LA LISTA ES " +elementos);
	
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		for (int i= 0 ; i<elementos ; i++) {
			numeros.add(mero.nextInt(100));
			
			
		} 
		System.out.println(numeros);
		int pequeño = Collections.min(numeros);
		int grande = Collections.max(numeros);
		
		System.out.println("El mayor es " + grande);
		System.out.println("El menor es " +pequeño);
		
		int suma = 0;
		
		for (int i = 0 ; i<elementos ; i++) {
		suma+=numeros.get(i);	
			
		}
		
		double promedio = suma / (double)elementos;
		System.out.println("La suma de los números es " +suma);
		System.out.println("El promedio es " +suma/(double)elementos);
		
		int adition = numeros.stream().mapToInt(Integer :: intValue).sum();
		System.out.println("La suma  es " +adition);
		System.out.println("El promedio es " +promedio);
		
	}
	
}
