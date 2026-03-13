package programacion2;

import java.util.Arrays;
import java.util.Random;

public class propuesto10 {
	
	public static void main ( String [] args) {
		
		Random random = new Random();
		
		int[] num = new int[100];
		
		for( int i = 0; i < num.length ; i++) {
			num[i]= 1+random.nextInt(100);
			
		}
		System.out.println(" --- ARRAY DESORDENADO ---\n ");
		System.out.println(Arrays.toString(num)+"\n");
		Arrays.sort(num);
		System.out.println(" --- ARRAY ORDENADO ---\n");
		System.out.println(Arrays.toString(num));
		
		boolean[] encontrado = new boolean [101];
			
	
		for(int numero : num) {
			
			 encontrado[numero] = true;
		}
		
		for(int i = 1 ; i< 100; i++) {
			if(!encontrado[i]) {
				
				System.out.println(i + "");
				
			}
			
			
		}
		
		
	}

}
