package ej4;

import java.util.Scanner;
import objectos.Cine;

public class Ej4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cine cine = new Cine();
        boolean lectura;

        do {
            System.out.println("Desea ingresar una película?");
            String rta = leer.next();

            switch (rta) {
                case "S":
                    lectura = cine.crearPelicula();
                    break;

                case "N":
                    lectura = false;
                    break;

                default:
                    System.out.println("Usted no introdujo ninguna respuesta válida");
                    lectura = true;
            }
        } while (lectura == true);
        
        cine.mostrarPeliculas();
        
        cine.ordenGeneral();
    }

}
