package objetos;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {

    private ArrayList<Jugador> Jugadores;
    private Pistola pistola;
    private Scanner leer;

    public Juego() {
        pistola = new Pistola();
        leer = new Scanner(System.in);
        Jugadores = new ArrayList();
    }

    public void llenarJuego(ArrayList<Jugador> Jugadores, Pistola r) {
        int i = 0;
        do {
            Jugador player = new Jugador();
            System.out.println("Seleccione un nombre de jugador");
            player.setNombre(leer.next());
            Jugadores.add(player);
            i++;

        } while (i < 6);
        r.llenarPistola();
        System.out.println(Jugadores.toString());
        pistola = r;
        this.Jugadores = Jugadores;
    }

    public void ronda() {
        boolean V;
        int i;
        String nombre;
        do {
            do {
                i = (int) (Math.random() * 10);
            } while (i > 5);
            System.out.println(i);
            nombre = Jugadores.get(i).getNombre();
            System.out.println("Turno del jugador " + Jugadores.get(i).getNombre());

            V = Jugadores.get(i).disparo(pistola);
        } while (V == false);

        System.out.println("El jugador que perdió es el " + nombre);
        System.out.println(pistola.toString());

    }
}
