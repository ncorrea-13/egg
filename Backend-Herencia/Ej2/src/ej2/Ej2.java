package ej2;

import Electrodomestico.Lavadora;
import Electrodomestico.Televisor;

public class Ej2 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        Televisor televisor = new Televisor();

        lavadora.crearLavadora();
        lavadora.precioFinal();
        
        System.out.println("Su lavadora está en nuestro sistema, esta posee");
        lavadora.escribirDatos();

        System.out.println("=============================================================================");

        televisor.crearTelevisor();
        televisor.precioFinal();

        System.out.println("Su televisor está subido a nuestro sistema, este posee:");
        televisor.escribirDatos();
    }

}
