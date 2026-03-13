package programacion2;

public class esCapicua{

	public static boolean esCapicua(int dato) {
	    Integer i = new Integer(dato);
	    String reverse = new StringBuffer(i.toString()).reverse().toString();
	    return i.toString().equals(reverse);
	}
}
