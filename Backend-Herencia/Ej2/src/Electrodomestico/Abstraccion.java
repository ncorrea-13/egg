package Electrodomestico;

public abstract class Abstraccion {

    protected Integer precio;
    protected String color;
    protected Character consumoEnergetico;

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public abstract void precioFinal();

    public abstract void crearElectrodomestico();

}
