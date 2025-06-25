package objetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class mazo {

    private MazoNuevo mazoNuevo, cartasEntregadas;
    private final Scanner leer;
    private carta carta;

    public mazo() {
        leer = new Scanner(System.in).useDelimiter("\n");
        mazoNuevo = new MazoNuevo();
        cartasEntregadas = new MazoNuevo();
    }

    public void crearBaraja() {
        ArrayList<carta> salida = new ArrayList();
        ArrayList<carta> entrada = new ArrayList();
        cartasEntregadas.setCarta(entrada);
        for (Palo aux : Palo.values()) {
            for (int i = 1; i < 13; i++) {
                if (i == 8 || i == 9) {

                } else {
                    carta nueva = new carta(i, aux);
                    salida.add(nueva);
                }
            }
        }
        mazoNuevo.setCarta(salida);
    }

    public void barajar() {
        Collections.shuffle(mazoNuevo.getCarta());
    }

    public void siguienteCarta() {
        System.out.println("La siguiente carta es la " + mazoNuevo.getCarta().get(0).toString());
    }

    public void cartasDisponibles() {
        if (mazoNuevo.getCarta().isEmpty()) {
            System.out.println("No quedan cartas disponibles");
        } else {
            System.out.println("Quedan " + mazoNuevo.getCarta().size() + " cartas disponibles");
        }
    }

    public void darCartas() {
        carta nuevas;

        System.out.println("Cuántas cartas desea entregar?");
        int cantidad = leer.nextInt();

        if (mazoNuevo.getCarta().isEmpty()) {
            System.out.println("no hay más cartas en el mazo");

        } else if (cantidad > mazoNuevo.getCarta().size()) {
            System.out.println("Usted está pidiendo más cartas de las que hay");

        } else {
            for (int i = 0; i < cantidad; i++) {
                nuevas = mazoNuevo.getCarta().get(i);
                mazoNuevo.getCarta().remove(i);
                cartasEntregadas.getCarta().add(nuevas);
            }
        }
    }

    public void cartasMonton() {
        carta nueva;
        if (cartasEntregadas.getCarta().isEmpty()) {
            System.out.println("están todas las cartas en el mazo");
        } else {
            for (int i = 0; i < cartasEntregadas.getCarta().size(); i++) {
                nueva = cartasEntregadas.getCarta().get(i);
                mazoNuevo.getCarta().add(nueva);
            }
        }
    }

    public void mostrarBaraja() {
        mazoNuevo.getCarta().forEach((mazo1) -> {
            System.out.println(mazo1.toString());
        });

    }

}
