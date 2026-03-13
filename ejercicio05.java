package programacion2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ejercicio05 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedHashMap<Integer, String> embutido = new LinkedHashMap<>();

        System.out.print("¿Cuántos productos quieres introducir? ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Introduce el precio: ");
            int precio = sc.nextInt();
            sc.nextLine(); 

            System.out.print("Introduce el nombre del producto: ");
            String nombre = sc.nextLine();

            embutido.put(precio, nombre);
        }

        System.out.println("\nEntradas introducidas:");

        for (Map.Entry<Integer, String> pareja : embutido.entrySet()) {
            System.out.println(pareja.getKey() + " -> " + pareja.getValue());
        }

        sc.close();
    }
}