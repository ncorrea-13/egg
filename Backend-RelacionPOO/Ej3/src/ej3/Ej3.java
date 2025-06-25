package ej3;

import java.util.Scanner;
import objetos.mazo;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        mazo mazo = new mazo();

        mazo.crearBaraja();
        int i;

        do {
            System.out.println("Que desea hacer?");
            System.out.println("1 barajar");
            System.out.println("2 dar una carta");
            System.out.println("3 ver cuantas cartas hay");
            System.out.println("4 dar varias cartas");
            System.out.println("5 devolver cartas al montón");
            System.out.println("6 mostrar las cartas");
            System.out.println("7 salir");
            
            i = leer.nextInt();
            switch (i){
                case 1:
                    mazo.barajar();
                    break;
                case 2:
                    mazo.siguienteCarta();
                    break;
                case 3:
                    mazo.cartasDisponibles();
                    break;
                case 4:
                    mazo.darCartas();
                    break;
                case 5:
                    mazo.cartasMonton();
                    break;
                case 6:
                    mazo.mostrarBaraja();
                    break;
                case 7:
            }
        } while (i != 7);

    }

}
