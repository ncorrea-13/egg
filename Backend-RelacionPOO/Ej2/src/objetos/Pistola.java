package objetos;

import java.util.Objects;

public class Pistola {

    private Integer posicionActual, posicionAgua;

    public Pistola() {
    }

    /**
     * It's made for reloading the gun
     */
    public void llenarPistola() {
        posicionAgua = (int) (Math.random() * 10);
        posicionActual = (int) (Math.random() * 10);
    }

    public boolean mojar() {
        boolean validez = false;
        if (Objects.equals(posicionActual, posicionAgua)) {
            validez = true;
        }
        return validez;
    }

    public void siguienteChorro() {
        if (posicionActual == 9) {
            posicionActual = 0;
        } else {
            posicionActual++;
        }
    }

    @Override
    public String toString() {
        return "Pistola{" + "posicion actual=" + posicionActual + ", posicion del agua=" + posicionAgua + '}';
    }
    
    
}
