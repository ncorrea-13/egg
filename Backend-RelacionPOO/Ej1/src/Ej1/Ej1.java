package Ej1;

import Objetos.Perro;
import Objetos.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        ArrayList<Persona> Gente = new ArrayList(5);
        Persona pipol = new Persona();
        ArrayList<Perro> Caninos = new ArrayList();

        for (int i = 0; i < 5; i++) {
            Caninos.add(pipol.crearPerro(i));
        }

        for (int i = 1; i < 6; i++) {
            System.out.println("Dicte los datos para el usuario nro " + i);
            Gente.add(pipol.crearPersona());
        }

        int k, j = 0;
        System.out.println("Los perros disponibles son :" + Caninos.toString());

        for (int i = 0; i < 5; i++) {
            System.out.println("Usuario " + Gente.get(i).getNombre() + " elija un perro de la lista (número)");
            k = leer.nextInt() - 1;
            if (Caninos.get(k).getDueno() == null) {

                Gente.get(i).elegirPerro(Caninos.get(k));
                Caninos.get(k).setDueno(Gente.get(i));
                System.out.println("registrado como" + Gente.get(i).toString());

                System.out.println(Caninos.toString());

            } else {

                System.out.println("Usted debe seleccionar otro perro, el seleccionado ya posee dueño");
                i--;

            }

        }
    }

}
