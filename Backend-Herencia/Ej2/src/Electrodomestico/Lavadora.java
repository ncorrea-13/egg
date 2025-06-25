package Electrodomestico;

import java.util.Scanner;

public final class Lavadora extends Electrodomestico {

    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer carga, Integer precio, Integer peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    public void crearLavadora() {
        super.crearElectrodomestico();
        Scanner leer2 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Dicte la carga de la lavadora");
        carga = leer2.nextInt();
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (carga > 30) {
            setPrecio(precio + 500);
        }
    }

    @Override
    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Carga: " + carga);
    }
}
