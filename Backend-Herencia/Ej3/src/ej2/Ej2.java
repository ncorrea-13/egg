package ej2;

import Electrodomestico.Electrodomestico;
import Electrodomestico.Lavadora;
import Electrodomestico.Televisor;
import java.util.ArrayList;

public class Ej2 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico> nuevo = new ArrayList();
        Integer PrecioLavadoras = 40, PrecioTv = 50;
        for (int i = 0; i < 2; i++) {
            Lavadora lavadora = new Lavadora();
            Televisor televisor = new Televisor();

            System.out.println("D a t o s   d e   l a   l a v a d o r a");
            lavadora.crearLavadora();
            PrecioLavadoras = PrecioLavadoras + lavadora.precioFinal();
            nuevo.add(lavadora);

            System.out.println("El electrodoméstico está en el sistema");

            System.out.println("=============================================================================");

            System.out.println("D a t o s   d e l   t e l e v i s o r");
            televisor.crearTelevisor();
            PrecioTv = PrecioTv + televisor.precioFinal();
            nuevo.add(televisor);

            System.out.println("El electrodoméstico está en el sistema");

            System.out.println("=============================================================================");
        }

        nuevo.forEach((hola) -> {

            hola.escribirDatos();

            System.out.println("=============================================================================");
        });
        
        System.out.println("El precio total de todas las lavadoras es de " + PrecioLavadoras);
        System.out.println("El precio total de todos los televisores es de " + PrecioTv);
        System.out.println("El precio total de todos sus productos es de " + (PrecioLavadoras + PrecioTv));

    }

}
