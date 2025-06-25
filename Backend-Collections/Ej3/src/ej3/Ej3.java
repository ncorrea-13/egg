package ej3;

import Objects.Controlador;
import java.util.Scanner;

public class Ej3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Controlador control = new Controlador();
        boolean Verdad;

        do {
            System.out.println("Desea agregar un nuevo alumno?");
            String rta = leer.next();

            switch (rta) {

                case "S":
                    Verdad = control.crearAlumno();
                    break;

                case "N":
                    Verdad = true;
                    break;

                default:
                    System.out.println("Error, usted no respondió correctamente");
                    Verdad = false;
            }

        } while (Verdad == false);

        System.out.print("Alumno buscado = ");
        String nombre = leer.next();
        nombre = nombre.toUpperCase();

        if (control.notaFinal(nombre)) {
            System.out.println("Su alumno se encuentra en lista");

        } else {
            System.out.println("No se encuentra");
        }
    }

}
