package Objects;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Controlador {

    ArrayList<Alumno> lista;
    Scanner leer;

    /**
     * Basic constructor It used to create the List and the Scanner
     */
    public Controlador() {
        this.lista = new ArrayList();
        this.leer = new Scanner(System.in).useDelimiter("\n");
    }

    /**
     * It create every single student
     * @return 
     * @returnIt is used for the "do while" which is in the Main
     */
    public boolean crearAlumno() {
        System.out.print("Alumno =");
        String name = leer.next();
        name = name.toUpperCase();

        System.out.print("Nota 1 =");
        Integer Nota1 = leer.nextInt();

        System.out.print("Nota 2 =");
        Integer Nota2 = leer.nextInt();

        System.out.print("Nota 3 =");
        Integer Nota3 = leer.nextInt();

        lista.add(new Alumno(name, Nota1, Nota2, Nota3));

        return false;
    }

    /**
     * It search for an specific student and shows their notes
     *
     * @param nombre it's the name of that student
     * @return if it's false, the program won't show any name or any score
     */
    public boolean notaFinal(String nombre) {
        System.out.println(lista.size());

        Iterator<Alumno> iterador = lista.iterator();
        boolean Verdad = false;

        while (iterador.hasNext()) {
            if (iterador.next().getNombre().equals(nombre)) {
                Verdad = true;
            }
        }
        return Verdad;
    }
}
