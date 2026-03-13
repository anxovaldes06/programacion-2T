package programacion2;

import java.util.Arrays;
import java.util.Random;


public class propuesto7 {
	
	
	  public static int[] juntarArrays(int[] a, int[] b) {
	     
	        int[] c = new int[a.length + b.length];

	        for (int i = 0; i < a.length; i++) {
	            c[i] = a[i];
	        }
	        for (int j = 0; j < b.length; j++) {
	            c[ a.length+j] = b[j];
	            
	        }
	        
	        return c;
	    }

	
	  public static int[] insertionSort(int[] array) {
	        int n = array.length;
	        for (int i = 1; i < n; i++) {
	            int aux = array[i];
	            int j = i - 1;

	            while (j >= 0 && array[j] > aux) {
	                array[j + 1] = array[j];
	                j = j - 1;
	            }
	            array[j + 1] = aux;
	        }
	        return array;
	    }

	
	
	
    public static void main(String[] args) {
        int[] uno = new int[70]; 
        int[] otro = new int[60];

        Random random = new Random(); 
        
        for(int i=0 ; i<uno.length ; i++){
            uno[i] = random.nextInt(350); 
        }
        System.out.println(Arrays.toString(uno));

        Random random2 = new Random();

        for(int i=0 ; i<otro.length ; i++){
            otro[i] = random2.nextInt(350); 
        }
        System.out.println(Arrays.toString(otro));

        uno = insertionSort(uno);
        otro = insertionSort(otro);
        
        System.out.println(Arrays.toString(uno));
        System.out.println(Arrays.toString(otro));
        
        
        
        int [] juntar = new int[130];
        juntar = juntarArrays(uno,otro);
        Arrays.sort(juntar);
        System.out.println(Arrays.toString(juntar));

    }

}  