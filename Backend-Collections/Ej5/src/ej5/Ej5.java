package ej5;

import Objetos.Controlador;
import java.util.Scanner;

public class Ej5 {

    public static void main(String[] args) {
        Controlador trabajo = new Controlador();
        Scanner leer = new Scanner(System.in);
        boolean Verdad = true;

        while (Verdad == true) {
            System.out.println("Desea agregar un país?");
            String rta = leer.next();

            switch (rta) {
                case "si":
                    Verdad = trabajo.crearPais();
                    break;
                case "no":
                    Verdad = false;
                    break;
                default:
                    System.out.println("No se ha ingresado una respuesta válida, pruebe nuevamente");
                    break;
            }
        }

        trabajo.ordenarCosas();
        trabajo.mostrarPaises();

        System.out.println("Qué país desea buscar?");
        trabajo.buscarPais(leer.next());
        
        trabajo.mostrarPaises();
    }

}
