package programacion2;


import java.util.HashMap;
import java.util.Scanner;

public class EJERCICIO7 {

	
	public static void main ( String[] args) {
		
		
		HashMap<Integer, String> nombres = new HashMap<>();
		
		nombres.put(123, "PACO");
		nombres.put(567, "ARTURO");
		nombres.put(345, "VICENTE");
		nombres.put(234, "OLEGARIO");
		nombres.put(987, "ELISEO");
		nombres.put(765, "FERMÍN");
		
		
		
	Scanner  sc = new Scanner  ( System.in);
	
	System.out.println("Por favor , introduzca un código: ");
	
	int codigo  = Integer.parseInt(sc.nextLine());
	
	if(nombres.containsKey(codigo)) {
		
		System.out.println("El codigo " +codigo+ " corresponde  a : ");

		System.out.println("\n" +nombres.get(codigo));
	}else {
		
		System.out.println("El código no pertenece a ningún número ");
		
	}
	
	
		
	}
	
	
}
