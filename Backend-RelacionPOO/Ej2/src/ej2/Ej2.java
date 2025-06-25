package ej2;

import java.util.ArrayList;
import objetos.Juego;
import objetos.Jugador;
import objetos.Pistola;

public class Ej2 {

    public static void main(String[] args) {
        Juego nuevoJuego = new Juego();
        ArrayList<Jugador> Jugadores = new ArrayList();
        Pistola pistola = new Pistola();

        nuevoJuego.llenarJuego(Jugadores, pistola);

        nuevoJuego.ronda();
    }

}
