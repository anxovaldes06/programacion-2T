package programacion2;

import java.util.Random;

public class Carta  implements Comparable<Carta>{
	
	
	
	enum valores{
 DOS, TRES , CUATRO, CINCO, SEIS, SIETE, SOTA , CABALLO, REY, AS
	}

	
	enum palos{
        BASTOS, COPAS , ESPADAS, OROS		
		
	}
	
	
	 valores valor;
	 palos palo;
	
	

	
	Carta(){
		
		Random random = new Random();
		valores[] arrayValores = valores.values();
		palos[] arrayPalos = palos.values();
		
		valor = arrayValores[random.nextInt(arrayValores.length)] ;
		palo =  arrayPalos[random.nextInt(arrayPalos.length)] ;
		
	}
	
	public Carta ( valores valor, palos palo) {
		
		this.palo=palo;
		this.valor=valor;
		
	}
	
	public valores getValor() {
		
		return valor;
		
	}
	
	public palos getpalo() {
		return palo;
	}

	public void setValor(valores valor) {
		this.valor = valor;
	}

	public void setPalo(palos palo) {
		this.palo = palo;
	}

	@Override
	public String toString() {
		return valor + " de " + palo;
	}

	@Override
	public int compareTo(Carta o) {	
		int comparacionPalo = this.palo.compareTo(o.palo);
		
		if( comparacionPalo != 0) {
			
			return comparacionPalo;
		}else {
			return this.valor.compareTo(o.valor);
			
		}
		
	}
	
}

