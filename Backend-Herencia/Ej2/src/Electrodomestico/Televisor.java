package Electrodomestico;

import java.util.Scanner;

public final class Televisor extends Electrodomestico {

    protected Integer resolucion;
    protected boolean sintonizador;

    public Televisor() {
    }

    public Televisor(Integer resolucion, boolean sintonizador, Integer precio, Integer peso, String color, char consumoEnergetico) {
        super(precio, peso, color, consumoEnergetico);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    public void crearTelevisor() {
        super.crearElectrodomestico();
        Scanner leer3 = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Dicte la cantidad de pulgadas");
        resolucion = leer3.nextInt();

        System.out.println("Posee sintonizador? S/N");
        switch (leer3.next()) {
            case "S":
                sintonizador = true;
            case "N":
                sintonizador = false;
        }
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (40 <= resolucion) {
            precio = (precio * (int) 0.3) + precio;
        }
        if (sintonizador = true) {
            precio = precio + 500;
        }
    }

    @Override
    public void escribirDatos() {
        super.escribirDatos();
        System.out.println("Pulgadas: " + resolucion);
        if (sintonizador = true) {
            System.out.println("Posee sintonizador");
        } else {
            System.out.println("No posee sintonizador");
        }
    }

}
