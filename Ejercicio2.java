package program2;

import java.util.Scanner;

public class Ejercicio2 {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena: ");
        String cadena = sc.nextLine();

        
        String[] palabras = cadena.split(" ");

  
        int cantidad = palabras.length;
        System.out.println("Cantidad de palabras: " + cantidad);

        System.out.print("Cadena en orden inverso: ");
        for (int i = palabras.length - 1; i >= 0; i--) {
            System.out.print(palabras[i] + " ");
        }

        sc.close();
    }
}