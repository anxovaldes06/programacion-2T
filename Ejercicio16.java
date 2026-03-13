package programacion2;       //paquete donde se encuentra la clase

import java.util.HashMap; //importamos dos herramientas de java que no vienen predifinidas 
import java.util.Scanner;

public class Ejercicio16 {  //clase dentro del paquete 

	public static void main(String[] args) {
        Scanner s = new Scanner(System.in);	//creamos un escáner 
  
        HashMap<String, String> capitales = new HashMap<>(); // nuevo hashmap, String pais -> String capital (relacionadas entre sí)

        capitales.put("España", "Madrid"); 	
        capitales.put("Portugal", "Lisboa");
        capitales.put("Francia", "París"); 		//insertamos tres pares clave-valor con 3 países y sus respectivas capitales

        String pais = ""; //definimos String pais

        while (true) {
            System.out.print("Escribe el nombre de un país y te diré su capital: ");
            pais = s.nextLine();			//pide escribir nombre país

     
            if (pais.equalsIgnoreCase("salir")) {		//si escribimos salir se acaba el bucle
                break;
            }

         
            if (capitales.containsKey(pais)) {
                System.out.println("La capital de " + pais + " es " + capitales.get(pais));			//si capitales contiene un país válido te devuelve dicha capital
            } else {
                System.out.print("No conozco la respuesta ¿cuál es la capital de " + pais + "?: ");
                String nuevaCapital = s.nextLine();										//si no contiene dicho país te pide insertar una nueva capital.
           
                capitales.put(pais, nuevaCapital);
                System.out.println("Gracias por enseñarme nuevas capitales");	//añade una nueva capital a dicho país
            }
        }
        
        System.out.println("¡Hasta luego!");  //bucle termina , SOLO si decimos "salir"
        s.close(); //cerramos el escáner, optimización
    }
	
}