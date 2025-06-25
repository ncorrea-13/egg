package ej1;

import Animal.Animal;
import Animal.Caballo;
import Animal.Gato;
import Animal.Perro;

public class Ej1 {

    public static void main(String[] args) {

        Animal perro = new Perro("Tuki", "DocChow", "Caniche", 10);
        perro.Alimentarse();
        
        Animal perro2 = new Perro("Cholo", "Choteras", "Golden", 9);
        perro2.Alimentarse();

        Animal gato = new Gato("Mich", "Wiskas", "Siames", 8);
        gato.Alimentarse();

        Animal caballo = new Caballo("Yeyo", "Pasto", "Blanco", 15);
        caballo.Alimentarse();
    }

}
