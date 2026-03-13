package program2;



import java.util.Scanner;


public class Ejercicio1 {
	
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Ingrese la segunda cadena: ");
        String cadena2 = sc.nextLine();

        String resultado = "";
        int i = 0;

        while (i < cadena1.length() && i < cadena2.length()) {
            resultado += cadena1.charAt(i);
            resultado += cadena2.charAt(i);
            i++;
        }

        // Agregar lo que sobra si una cadena es más larga
        resultado += cadena1.substring(i);
        resultado += cadena2.substring(i);

        System.out.println("Cadena intercalada: " + resultado);

        sc.close();
    }
}