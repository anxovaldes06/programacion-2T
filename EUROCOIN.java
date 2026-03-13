package programacion2;

import java.util.Random;

public class EUROCOIN {

    public static void main(String[] args) {

        String[] valores = {   "1 céntimo", "2 céntimos", "5 céntimos",
                               "10 céntimos", "20 céntimos", "50 céntimos",
                               "1 euro", "2 euros" };

        String[] posiciones = {"cara", "cruz"};

        Random r = new Random();

       
        String valor = valores[r.nextInt(valores.length)];
        String posicion = posiciones[r.nextInt(2)];

        System.out.println(valor + " - " + posicion);

     
        for (int i = 1; i < 6; i++) {

            boolean coincideValor = r.nextBoolean();

            if (coincideValor) {
              
                valor = valor;
                posicion = posiciones[r.nextInt(2)];
            } else {
                	
                valor = valores[r.nextInt(valores.length)];
                posicion = posicion;
            }

            System.out.println(valor + " - " + posicion);
        }
    }
}
