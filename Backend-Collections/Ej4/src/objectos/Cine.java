package objectos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Cine {

    ArrayList<Pelicula> lista;
    Scanner leer;

    public Cine() {
        lista = new ArrayList();
        leer = new Scanner(System.in).useDelimiter("\n");
    }

    public boolean crearPelicula() {

        System.out.print("Título =");
        String Titulo = leer.next();

        System.out.print("Autor =");
        String Autor = leer.next();

        System.out.print("Duración =");
        Double duracion = leer.nextDouble();

        lista.add(new Pelicula(Titulo, Autor, duracion));
        return true;
    }

    public void mostrarPeliculas() {
        Iterator<Pelicula> iterador = lista.iterator();

        while (iterador.hasNext()) {
            Pelicula peli = (Pelicula) iterador.next();
            System.out.print(peli.toString());
            System.out.println("");
        }

    }
    
    public void ordenGeneral(){
        Collections.sort(lista, compararHora);
        mostrarPeliculas();     
        escribirBarras();
        
        Collections.sort(lista, horaInversa);
        mostrarPeliculas();
        escribirBarras();
        
        Collections.sort(lista, ordenDirector);
        mostrarPeliculas();
        escribirBarras();
        
        Collections.sort(lista, ordenTitulo);
        mostrarPeliculas();
    }
    
    public void escribirBarras(){
        System.out.println("");
        System.out.println("------------------------------------------------------------------");
        System.out.println("");
    }

    
    public static Comparator<Pelicula> compararHora = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula P1, Pelicula P2) {

            return P1.getTitulo().compareTo(P2.getTitulo());

        }

    };
    
    public static Comparator<Pelicula> horaInversa = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula P1, Pelicula P2) {

            return P2.getDuracion().compareTo(P1.getDuracion());

        }

    };
    
    public static Comparator<Pelicula> ordenDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula P1, Pelicula P2) {

            return P2.getDirector().compareTo(P1.getDirector());

        }

    };
    
    public static Comparator<Pelicula> ordenTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula P1, Pelicula P2) {

            return P2.getTitulo().compareTo(P1.getTitulo());

        }

    };
    
}

