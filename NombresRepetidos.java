package programacion2;

import java.util.Arrays;
import java.util.Random;

public class NombresRepetidos {
	
	
	
    public static void main(String[] args) {
    		
    	Random random = new Random();
    	
    	String[] nombres = {
                "Eustaquio", "Paco", "Pepe", "Srdan", "Ermenegildo", 
                "Godofredo", "Arturo", "Vicente", "Santiago", "Melchor","Josefina", 
                "Maribel", "Maripili", "Maricarmen", "Mariana", 
                "Eugenia", "Eustaquia", "Victoria", "Pepita", "Gabriela"
                
                
            };

          
          
            
            int tam1 = 7 + random.nextInt(5);
            int tam2 = 5 + random.nextInt(10);
            
            String[] array1 = new String[tam1];
            String[] array2 = new String[tam2];
            
            System.out.println(array1.length);
            System.out.println(array2.length);
         
            
           for(int i = 0 ; i<tam1 ; i++) {
        	   array1[i] = nombres[random.nextInt(20)];
        	   
        	   
           }
           
           for ( int j= 0; j< tam2 ; j++) {
        	   array2[j] = nombres[random.nextInt(20)];
        	   
        	   
           }
           Arrays.sort(array1);
           Arrays.sort(array2);
           
           
           System.out.println(Arrays.toString(array1));
           System.out.println(Arrays.toString(array2));
           
           String [] temporal = new String[Math.min(tam1, tam2)];
           
           int i=0;
           int j=0;
           int k= 0;
           
           while (i < tam1 && j < tam2) {
        	   
        	   int comparacion = array1[i].compareTo(array2[j]);
        	   if(comparacion ==0) {
        	 if(k == 0 || !array1[i].equals(temporal[k-1])) {
        		 
        	 temporal[k++] = array1[i];
        	 } 
        	 i++;
        	 j++;
        	 
        	 
        	 }else if(comparacion <0) {
        	i++;	 
        	 
        	 }else {
        		
        		 j++;
        		 
        	 }
        	   
        	   String[] repetidos = Arrays.copyOf(temporal, k);

               System.out.println("---");
               System.out.println("Nombres repetidos: " + Arrays.toString(repetidos));
               System.out.println("Total encontrados: " + k);
        	 }
        	 }
             
           }






































