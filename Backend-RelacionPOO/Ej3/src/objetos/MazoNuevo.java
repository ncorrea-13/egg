package objetos;

import java.util.ArrayList;

public class MazoNuevo {

    private ArrayList<carta> carta;

    public MazoNuevo() {
    }

    public MazoNuevo(ArrayList<carta> carta) {
        this.carta = carta;
    }

    public ArrayList<objetos.carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<carta> carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "MazoNuevo{" + "carta=" + carta + '}';
    }

}
