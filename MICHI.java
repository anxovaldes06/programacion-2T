package programacion2;

import java.util.Objects;

public class MICHI implements Comparable<MICHI> {
		private String nombre;
		private String color;
		private String raza;

		public MICHI(String nombre, String color, String raza) {
			this.nombre = nombre;
			this.color = color;
			this.raza = raza;
		}

		public String getNombre() {
			return nombre;
		}

		public String getRaza() {
			return raza;
		}
		
		
		public String getColor() {
			return color;
		}

		
		
		@Override
		public int hashCode() {
			return Objects.hash(color, nombre, raza);
		}

	

	
		
		public String toString() {
			return "Nombre: " + this.nombre + "\nColor: " + this.color + "\nRaza: " + this.raza;
		}

		public int compareTo(MICHI M) {
			return (this.nombre).compareTo(M.getNombre());
		}

		public boolean equals(MICHI M) {
			return (this.nombre).equals(M.getNombre());
		}
	}