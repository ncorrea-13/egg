package Objetos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Servicio {

    ArrayList<String> Lista = new ArrayList();
    Scanner leer = new Scanner(System.in);
    Perro raza = new Perro();

    public Servicio() {

    }

    /**
     * Control all the system
     */
    public void controlServicio() {
        int i = 1;
        while (i == 1) {
            Lista.add(crearRaza());
            i = seguirAgregando();
        }

        System.out.println(Lista.toString());
        buscaPerro();
        System.out.println(Lista.toString());
    }

    /**
     * Allows to create some animal's breeds
     *
     * @return the breed which was added before
     */
    public String crearRaza() {
        System.out.println("Dicte la raza que desea crear");
        raza.setRaza(leer.next());

        return raza.getRaza();
    }

    /**
     * Ask if the user wants to create another breed
     *
     * @return as if it was a boolean
     */
    public int seguirAgregando() {
        System.out.println("Desea agregar otra raza?");
        String rta = leer.next();
        int i = 0;
        switch (rta) {
            case "S":
                i = 1;
            case "N":
                break;
            default:
                System.out.println("No ha introducido una respuesta válida");
                System.out.println("Vuelva a intentarlo");
                seguirAgregando();
        }
        return i;
    }

    /**
     * It is made for delete a breed
     */
    public void buscaPerro() {
        System.out.println("Que raza desea eliminar?");
        String busqueda = leer.next();
        Iterator<String> iterador = Lista.iterator();
        int i=0;
        
        while (iterador.hasNext()) {
            String aux = iterador.next();
            if (aux.equals(busqueda)) {
                iterador.remove();
                i = 1;

            }
        }
        
            if (i == 0) {
                System.out.println("No se ha encontrado su raza");
            }
    }

}
