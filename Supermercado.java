package programacion2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Supermercado   {
	

    public static void main(String[] args) {
    	

        HashMap<String, Float> productos = new HashMap<String, Float>();
        HashMap<String, Integer> totalProductos = new HashMap<String,Integer>();
        
        productos.put("avena", 2.21f);
        productos.put("garbanzos", 2.39f);
        productos.put("tomate", 1.59f);
        productos.put("jengibre", 3.13f);
        productos.put("quinoa", 4.50f);
        productos.put("guisantes", 1.60f);

        ArrayList<String> listaProductos = new ArrayList<>();
        ArrayList<Double> listaPrecios = new ArrayList<>();
        ArrayList<Integer> listaCantidades = new ArrayList<>();
        ArrayList<Double> listaTotalPrecio = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String producto;
        
    

    	

        do {
        		System.out.print("Producto: ");
        		producto = sc.nextLine().toLowerCase();
        		
        		if(producto.equals("fin")) {
        			break;
        		}
        		
        		
        		
        		if(!productos.containsKey(producto)) {
        			System.out.println("No existe dicho producto");
        			continue;
        		}
        		
        		
        	
  
                System.out.print("Cantidad: ");
                
                int cantidad = Integer.parseInt(sc.nextLine());
                double precio = productos.get(producto);
                double totalprecio = precio * cantidad;

                listaProductos.add(producto);
                listaPrecios.add(precio);
                listaCantidades.add(cantidad);
                listaTotalPrecio.add(totalprecio);
         
             
                

        } while(!producto.equals("fin"));
        
        

        System.out.println("\nProducto   Precio   Cantidad   totalProducto");
        System.out.println("\n---------------------------------------");

        double total = 0;

        for (int i = 0; i < listaProductos.size(); i++) {
            System.out.printf("\n" + listaProductos.get(i)
                    + "   " + listaPrecios.get(i)
                    + "   " + listaCantidades.get(i)
                    + "   " + listaTotalPrecio.get(i)
                    + "\n");

            total += listaTotalPrecio.get(i);
            
        }

        System.out.println("\n---------------------------------------");
        System.out.printf("\nPRECIO FINAL: " + total+"\n");
        
   
     System.out.println("\nIntroduzca código de descuento (INTRO si no tiene ninguno): ");
     String codigoDescuento = sc.nextLine();

     if (codigoDescuento.equals("ECODTO")) {
         total-= total * 0.10;
         System.out.println("Descuento aplicado: 10%");
     } else {
         System.out.println("No se ha aplicado ningún descuento.");
     }

     System.out.printf("\nPRECIO FINAL: " + total);

  
        
    }

	
  
}

