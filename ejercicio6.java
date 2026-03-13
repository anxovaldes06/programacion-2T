package programacion2;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicio6 {

	public static void main (String [] args) {
		
		Scanner sc = new Scanner (System.in);
		
		HashMap<String, String> registro = new HashMap<String, String>();
		registro.put("paco", "abcd");
		registro.put("anselmo", "1234");
		registro.put("mariano", "qert");
		registro.put("pepe", "tq5f");
		registro.put("rigoberto", "4321");
		registro.put("ermenigildo", "zyxw");
	
		int veces=0;
	
		do {
		String user = "";
		System.out.println("nombre de usuario : ");
		user = sc.nextLine();
		
		String contrasena = "";
		System.out.println("contraseña : ");
		contrasena = sc.nextLine();
		
		if(registro.containsKey(user) && contrasena.equals(registro.get(user))) {
			System.out.println("HAS INGRESADO EN EL ÁREA 51");
			break;
			
		}else if(registro.containsKey(user )){
			System.out.println("CONTRASEÑA NO VÁLIDA");
		
			veces++;
		}else {
			System.out.println("USUARIO NO ENCONTRADO");
		
			veces++;
			
		}
		
		}while(veces<3);
		if( veces == 3) {
			
			System.out.println("\nVuelva a intentarlo más tarde");
			
		}
	}
	
}
