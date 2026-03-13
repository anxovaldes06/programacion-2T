package programacion2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class gestionDiscos  {
	
	static Scanner s = new Scanner(System.in);
	
	
	public static ArrayList<Disco> discos = new ArrayList<Disco>();
			



	public static void mockDiscos() {
		 discos.add(new Disco("ESP001", "Mecano", "Descanso dominical", "pop", 50));
		    discos.add(new Disco("ESP002", "Héroes del Silencio", "Senderos de traición", "rock", 48));
		    discos.add(new Disco("ESP003", "Extremoduro", "Agila", "rock urbano", 44));
		    discos.add(new Disco("ESP004", "El Canto del Loco", "Zapatillas", "pop rock", 40));
		    discos.add(new Disco("ESP005", "La Oreja de Van Gogh", "El viaje de Copperpot", "pop", 42));
		    discos.add(new Disco("ESP006", "Amaral", "Pájaros en la cabeza", "pop rock", 45));
		    discos.add(new Disco("ESP007", "Fito & Fitipaldis", "Por la boca vive el pez", "rock", 41));
		    discos.add(new Disco("ESP008", "Vetusta Morla", "Un día en el mundo", "indie rock", 39));
		    discos.add(new Disco("ESP009", "Love of Lesbian", "1999", "indie", 38));
		    discos.add(new Disco("ESP010", "IZAL", "Copacabana", "indie pop", 37));

		    discos.add(new Disco("ESP011", "Rosalía", "El mal querer", "flamenco pop", 36));
		    discos.add(new Disco("ESP012", "Alejandro Sanz", "Más", "pop", 52));
		    discos.add(new Disco("ESP013", "David Bisbal", "Corazón latino", "pop", 43));
		    discos.add(new Disco("ESP014", "Pablo Alborán", "Terral", "balada", 40));
		    discos.add(new Disco("ESP015", "Malú", "Aprendiz", "pop", 44));
		    discos.add(new Disco("ESP016", "Estopa", "Estopa", "rumba rock", 45));
		    discos.add(new Disco("ESP017", "Melendi", "Que el cielo espere sentao", "pop rock", 41));
		    discos.add(new Disco("ESP018", "Manolo García", "Arena en los bolsillos", "rock", 47));
		    discos.add(new Disco("ESP019", "Duncan Dhu", "Autobiografía", "pop rock", 46));
		    discos.add(new Disco("ESP020", "Loquillo", "Balmoral", "rock", 39));

		    discos.add(new Disco("ESP021", "Nacha Pop", "Buena disposición", "pop rock", 40));
		    discos.add(new Disco("ESP022", "Los Secretos", "Adiós tristeza", "pop", 42));
		    discos.add(new Disco("ESP023", "Marea", "Besos de perro", "rock", 43));
		    discos.add(new Disco("ESP024", "Sôber", "Paradÿsso", "metal alternativo", 38));
		    discos.add(new Disco("ESP025", "Barón Rojo", "Volumen brutal", "heavy metal", 44));
		    discos.add(new Disco("ESP026", "Obús", "El que más", "heavy metal", 39));
		    discos.add(new Disco("ESP027", "La Raíz", "Entre poetas y presos", "ska rock", 41));
		    discos.add(new Disco("ESP028", "Ska-P", "El vals del obrero", "ska", 43));
		    discos.add(new Disco("ESP029", "Celtas Cortos", "Cuéntame un cuento", "folk rock", 40));
		    discos.add(new Disco("ESP030", "El Barrio", "Yo sueño flamenco", "flamenco", 42));

		    discos.add(new Disco("ESP031", "India Martínez", "Camino de la buena suerte", "flamenco pop", 38));
		    discos.add(new Disco("ESP032", "Niña Pastori", "Cañaílla", "flamenco", 37));
		    discos.add(new Disco("ESP033", "Camela", "Lágrimas de amor", "tecno-rumba", 36));
		    discos.add(new Disco("ESP034", "La Casa Azul", "La revolución sexual", "indie pop", 35));
		    discos.add(new Disco("ESP035", "Sidonie", "El peor grupo del mundo", "indie rock", 34));
		    discos.add(new Disco("ESP036", "Miss Caffeina", "Detroit", "indie", 33));
		    discos.add(new Disco("ESP037", "Leiva", "Monstruos", "rock", 39));
		    discos.add(new Disco("ESP038", "Pereza", "Animales", "rock", 40));
		    discos.add(new Disco("ESP039", "Second", "Fracciones de un segundo", "indie rock", 37));
		    discos.add(new Disco("ESP040", "Supersubmarina", "Santacruz", "indie rock", 38));

		    discos.add(new Disco("ESP041", "Lori Meyers", "Cuando el destino nos alcance", "indie", 36));
		    discos.add(new Disco("ESP042", "Zahara", "Astronauta", "indie pop", 35));
		    discos.add(new Disco("ESP043", "Rozalén", "Cuando el río suena...", "cantautor", 37));
		    discos.add(new Disco("ESP044", "Ismael Serrano", "La memoria de los peces", "cantautor", 42));
		    discos.add(new Disco("ESP045", "Joaquín Sabina", "19 días y 500 noches", "rock", 49));
		    discos.add(new Disco("ESP046", "Joan Manuel Serrat", "Mediterráneo", "cantautor", 50));
		    discos.add(new Disco("ESP047", "Miguel Ríos", "Rock & Ríos", "rock", 48));
		    discos.add(new Disco("ESP048", "Raphael", "Mi gran noche", "balada", 41));
		    discos.add(new Disco("ESP049", "Julio Iglesias", "Soy un truhán, soy un señor", "balada", 39));
		    discos.add(new Disco("ESP050", "Alaska y Dinarama", "Deseo carnal", "pop", 44));

		    discos.add(new Disco("ESP051", "La Unión", "Mil siluetas", "pop rock", 36));
		    discos.add(new Disco("ESP052", "Radio Futura", "La canción de Juan Perro", "rock", 45));
		    discos.add(new Disco("ESP053", "Burning", "El fin de la década", "rock", 38));
		    discos.add(new Disco("ESP054", "Triana", "El patio", "rock andaluz", 43));
		    discos.add(new Disco("ESP055", "Los Planetas", "Una semana en el motor de un autobús", "indie rock", 44));
		    discos.add(new Disco("ESP056", "Delafé y las Flores Azules", "vs. Las Trompetas de la Muerte", "indie", 34));
		    discos.add(new Disco("ESP057", "Fangoria", "Cuatricromía", "electropop", 37));
		    discos.add(new Disco("ESP058", "Dover", "Devil Came to Me", "rock alternativo", 40));
		    discos.add(new Disco("ESP059", "Hevia", "Tierra de nadie", "folk", 35));
		    discos.add(new Disco("ESP060", "Mägo de Oz", "Finisterra", "folk metal", 46));

		    discos.add(new Disco("ESP061", "WarCry", "El sello de los tiempos", "power metal", 42));
		    discos.add(new Disco("ESP062", "Los Suaves", "Malas noticias", "rock", 39));
		    discos.add(new Disco("ESP063", "Rosendo", "Agradecido", "rock urbano", 37));
		    discos.add(new Disco("ESP064", "Antonio Orozco", "Cadizfornia", "pop", 38));
		    discos.add(new Disco("ESP065", "Vanesa Martín", "Crónica de un baile", "pop", 36));
		    discos.add(new Disco("ESP066", "Beret", "Prisma", "pop urbano", 35));
		    discos.add(new Disco("ESP067", "C. Tangana", "El madrileño", "urbano", 41));
		    discos.add(new Disco("ESP068", "Lola Índigo", "Akelarre", "pop urbano", 34));
		    discos.add(new Disco("ESP069", "Aitana", "Spoiler", "pop", 33));
		    discos.add(new Disco("ESP070", "Pablo López", "El mundo y los amantes inocentes", "pop", 38));

		    discos.add(new Disco("ESP071", "La Habitación Roja", "Memoria", "indie rock", 32));
		    discos.add(new Disco("ESP072", "Ángel Stanich", "Camino ácido", "indie rock", 31));
		    discos.add(new Disco("ESP073", "Fuel Fandango", "Aurora", "electrofusión", 30));
		    discos.add(new Disco("ESP074", "Oques Grasses", "Fans del sol", "pop", 29));
		    discos.add(new Disco("ESP075", "M-Clan", "Sin enchufe", "rock", 35));
		    discos.add(new Disco("ESP076", "Revólver", "Básico", "rock", 36));
		    discos.add(new Disco("ESP077", "Los Rodríguez", "Palabras más, palabras menos", "rock", 43));
		
		
	    discos.add(new Disco(
	      "GASA41", "Wim Mertens", "Maximazing the Audience", "instrumental", 50));
	    
	    discos.add(new Disco(
	      "FGHQ64", "Metallica", "Black album", "hard rock", 46));
	    discos.add(new Disco(
	      "TYUI89", "Supersubmarina", "Viento de cara", "pop rock", 42));
	    
		
		
	}
	
	private static void cargarColeccionDesdeAlmacenamiento() {
		
		File fichero = new File("coleccion.obj"); 
		
		if(!fichero.exists()) {
			System.out.println("No hay archivo de guardado previo. Creando colección nueva...");
			mockDiscos();
			return;
			
		}
		
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("coleccion.obj"))){
			discos = (ArrayList<Disco>) ois.readObject();
			System.out.println("Colección guardada con éxito");
			
		}catch(IOException  | ClassNotFoundException e){
			System.out.println("Error al cargar la coleccion : " +e.getMessage());
			mockDiscos();			
		}
		
	}
	
	private static void guardarColeccionEnAlmacenamiento() {
	    
	    try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("coleccion.obj"))){
	        
	        oos.writeObject(discos);   
	        System.out.println("Colección guardada correctamente en coleccion.obj");
	        
	    }catch(IOException e){
	        System.out.println("Error al guardar la coleccion : " + e.getMessage());
	    }
	}
	
	

public static void addDiscos() {	
	
	System.out.print("Código: ");
	String codigo = s.nextLine();
	System.out.print("Autor: ");
	String autor = s.nextLine();
	System.out.print("Título: ");
	String titulo = s.nextLine();
	System.out.print("Género: ");
	String genero= s.nextLine();
	System.out.print("Duración: ");
	Integer duracion = Integer.parseInt(s.nextLine());
	
	discos.add(new Disco(codigo,autor,titulo,genero,duracion));
	System.out.println(" disco añadido correctamente");	
}
	
public static int buscarCodigo() {

    System.out.println("Introduzca código existente:");
    String code = s.nextLine();

    for (int i = 0; i < discos.size(); i++) {
        if ( discos.get(i).getCodigo().equals(code)) {
            return i;
        }
    }

    
    return -1;
    
}
		
	
	
	private static void modificarDiscoExistente() {

		
		

	    int pos = buscarCodigo();
	    	if(pos==-1) {
	    		System.out.println("No se ha encontrado ningún código ");
	    	}else {
	    System.out.println("Modificando disco:");
	    System.out.println(discos.get(pos));

	    System.out.println("Introduzca los nuevos datos (deje en blanco para no modificar)");
	    Disco dis = discos.get(pos);

	    System.out.print("Nuevo código: ");
	    String codigo = s.nextLine();
	    if (!codigo.equals("")) {
	        dis.setCodigo(codigo);;
	    }

	    System.out.print("Nuevo autor: ");
	    String autor = s.nextLine();
	    if (!autor.equals("")) {
	        dis.setAutor(autor);
	    }

	    System.out.print("Nuevo título: ");
	    String titulo = s.nextLine();
	    if (!titulo.equals("")) {
	        dis.setTitulo(titulo);
	    }  

	    System.out.print("Nuevo género: ");
	    String genero = s.nextLine();
	    if (!genero.equals("")) {
	        dis.setGenero(genero);
	    }

	    System.out.print("Nueva duración: ");
	    String duracion = s.nextLine();
	    if (!duracion.equals("")) {
	        dis.setDuracion(Integer.parseInt(duracion));
	    }
	    System.out.println("Disco modificado correctamente.");
	    }

	
	}
	
	
	private static void borrarDiscoExistente() {
		
		
	int pos = buscarCodigo();	
		if(pos==-1) {
		System.out.println("Disco no encontrado");
		}else {
			System.out.println("Disco encontrado");
			System.out.println(discos.get(pos));
			
			System.out.println("Desea borrar este disco(S/N)??");
			String respuesta = s.nextLine().toUpperCase();
			
			if(respuesta.equals("S")) {
				System.out.println("Está totalmente seguro de que desea eliminarlo(S/N)??");
				String respuesta2 = s.nextLine().toUpperCase();
				
				if(respuesta.equals("S")) {
					discos.remove(pos);
					
				System.out.println("Disco borrado correctamente");
				
				}else {
					System.out.println("Operación cancelada en la segunda operación");
					
				}
				
			}else{
				System.out.println("Operación cancelada con éxito");
				
			}
		}
		
		
		
		
	}

	
	public static void main (String[] args) {
		
			int opcion = 0;
		    mockDiscos(); 
		   
		    
		do {
			
			System.out.println("\nCOLECCIÓN DE DISCOS");
			System.out.println("===================");
			System.out.println("[1]LISTADO");
			System.out.println("[2]NUEVO DISCO");
			System.out.println("[3]MODIFICAR");
			System.out.println("[4]BORRAR");
			System.out.println("[5]GUARDAR EN ALMACENAMIENTO");
			System.out.println("[6]CARGAR DESDE ALMACENAMIENTO");
			System.out.println("[7]ORDENAMIENTOS DIFERENTES A CÓDIGO");
			System.out.println("[8]SALIR");
			System.out.println("Introduzca una opción: ");
			
			 opcion = Integer.parseInt(s.nextLine());
			
			switch(opcion) {
			
			case 1: 
			    System.out.println("\nLISTADO");
			    System.out.  println("=======");

			          

			    for(Disco d : discos) {
			          System.out.println(d);
			       
			    }

			    break;
			case 2:
				System.out.println("\nNUEVO DISCO");
				System.out.println("===========");
			    addDiscos();

				break;
			case  3:
				System.out.println("\nMODIFICAR");
				System.out.println("=========");
				modificarDiscoExistente();
				break;
			case 4:
				System.out.println("\nBORRAR");
				System.out.println("======");
				borrarDiscoExistente();
				break;
			case 5:
				System.out.println("\nGUARDAR EN ALMACENAMIENTO");
				System.out.println("=========================");
			    guardarColeccionEnAlmacenamiento();

				break;
			case 6:
				System.out.println("\nCARGAR DESDE ALMACENAMIENTO");
				System.out.println("===========================");
				 cargarColeccionDesdeAlmacenamiento();
				break;
			case 7 :
				System.out.println("\nESCOGER CRITERIO DE ORDENAMIENTOS");
				System.out.println("=================================");
				
				break;
				
			default:
				
				
				
				if(opcion ==8) {
				
					System.out.println("... abandonando gestión de discos definivamente ...");
					
				}else {	
					System.out.println("... Opción no válida ... Vuelva a probar con otro número");
				
				}
				
				
				break;
			}
			
		}while (opcion !=8);
		
		
		
		
		
		
		
		
		
		
	}

}
