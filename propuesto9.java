package programacion2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class propuesto9 {

	public static <V> void  main (String[] args) {
	Random random  = new Random();
	int[] aleatorios = new int [1000];
	
	for (int i=0; i< aleatorios.length ;i++){
		aleatorios[i] =  10 + random.nextInt(71);
		
	}
	System.out.println(Arrays.toString(aleatorios));
	Arrays.sort(aleatorios);
	System.out.println(Arrays.toString(aleatorios));
	
	int max = aleatorios[0];
	int min = aleatorios[0];
	int total = 0;
	
	for (Integer i : aleatorios) {
	if(i>max) {
		max= i;
		
	}else if(i<min) {
		min= i;
	}	
		total+=i;
		
	}
	
	System.out.println("máximo es " +max);
	System.out.println("mínimo es " +min);
	System.out.println("el total es " +total);
	System.out.println("la media es " +(double)total/aleatorios.length);
	
	
	HashMap<Integer,Integer> cuenta= new HashMap<Integer,Integer>();
	
	for(int i=0; i<81;i++) {
		cuenta.put(i,0);
		
	}
	
	for( Map.Entry<Integer,Integer> pareja : cuenta.entrySet()) {
		
		System.out.println(pareja);
	}
	
	
	for ( Integer i : aleatorios){
		int valor = cuenta.get(i);
		cuenta.put(i, valor+1);
		
	}
	
	for( Map.Entry<Integer,Integer> pareja : cuenta.entrySet()) {
		
		System.out.println(pareja.getKey()+ "-->");		
		System.out.println(pareja.getValue());
	}
	
	int moda = aleatorios[0];
	int repe = 0;
	for(Map.Entry<Integer,Integer> pareja :  cuenta.entrySet()) {
		
		if (pareja.getValue()> repe) {
			repe= pareja.getValue();
			moda =   pareja.getKey();
		}
		
	}
	
	System.out.println("La moda es : " +moda+ " que se repite : " +repe+ " veces");
	
  
		}
}
