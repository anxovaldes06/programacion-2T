package programacion2;


import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSupermercado {
    public static void main(String[] args) {
       
        ArrayList<String> inventario = new ArrayList<>();

     
        Collections.addAll(inventario, "Monitor", "Teclado", "Ratón", "Laptop");

      
        String busqueda = "Monitor";
        if (inventario.contains(busqueda)) {
            System.out.println(" El producto '" + busqueda + "' está en stock.");
        }

      
        System.out.println("El primer producto es: " + inventario.get(0));

       
        inventario.set(1, "Teclado Mecánico"); 

    
        Collections.sort(inventario);
        
        System.out.println("\n--- Inventario Actualizado y Ordenado ---");
        for (String pc : inventario) {
            System.out.println("- " + pc);
        }

       
        inventario.clear();
        System.out.println("\n¿Inventario vacío? " + inventario.isEmpty());
    }
}