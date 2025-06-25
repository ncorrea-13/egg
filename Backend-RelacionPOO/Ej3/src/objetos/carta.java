package objetos;

public class carta {

    private Integer número;
    private Palo palo;

    public carta() {
    }

    public carta(Integer número, Palo palo) {
        this.número = número;
        this.palo = palo;
    }

    public Integer getNúmero() {
        return número;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setNúmero(Integer número) {
        this.número = número;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "carta{" + "número=" + número + ", palo=" + palo + '}';
    }

}
