package Objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Controlador {

    public Scanner leer = new Scanner(System.in);
    public HashSet<String> Lugar = new HashSet();

    public Controlador() {
    }

    /**
     * Creation of a new object in the HashSet
     *
     * @return true so you'll be able to create another object
     */
    public boolean crearPais() {

        System.out.println("Cuál es su país?");
        Lugar.add(leer.next());

        return true;
    }

    /**
     * This is made for print the list
     */
    public void mostrarPaises() {
        Iterator<String> iterador = Lugar.iterator();

        while (iterador.hasNext()) {
            String pais = (String) iterador.next();
            System.out.print("Su país es " + pais);
            System.out.println("");

        }
    }

    /**
     * It's putting in order all the country
     */
    public void ordenarCosas() {
        ArrayList<String> LugarComparado = new ArrayList(Lugar);
        Collections.sort(LugarComparado);
    }

    public void buscarPais(String buscado) {
        Iterator<String> iterador = Lugar.iterator();
        while (iterador.hasNext()) {
            if (iterador.next().equals(buscado)) {
                System.out.println("Se ha encontrado y eliminado el objeto");
                iterador.remove();
                break;
            }else
                System.out.println("No se ha encontrado el objeto");
        }
    }
}
