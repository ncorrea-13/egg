package Electrodomestico;

import java.util.Scanner;

public class Electrodomestico extends Abstraccion {

    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Integer peso, String color, char consumoEnergetico) {
        this.precio = precio;
        this.peso = peso;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPrecio() {
        return precio;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public char comprobarConsumo(char letra) {
        switch (letra) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
                break;
            default:
                letra = 'F';
        }
        return letra;
    }

    public String comprobarColor(String color) {
        String toLowerCase = color.toLowerCase();
        switch (toLowerCase) {
            case "rojo":
            case "azul":
            case "negro":
            case "gris":
                break;
            default:
                color = "blanco";
        }
        return color;
    }

    @Override
    public void crearElectrodomestico() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Dicte el precio");
        precio = leer.nextInt();
        if (precio < 1000) {
            precio = 1000;
        }

        System.out.println("Dicte el peso");
        peso = leer.nextInt();

        System.out.println("Dicte el color");
        color = comprobarColor(leer.next());

        System.out.println("Dicte el consumo eléctrico");
        consumoEnergetico = comprobarConsumo(leer.next().charAt(0));
    }

    @Override
    public void precioFinal() {

        switch (consumoEnergetico) {
            case 'A':
                precio = precio + 1000;
                break;
            case 'B':
                precio = precio + 800;
                break;
            case 'C':
                precio = precio + 600;
                break;
            case 'D':
                precio = precio + 500;
                break;
            case 'E':
                precio = precio + 300;
                break;
            case 'F':
                precio = precio + 100;

        }

        if (1 <= peso) {
            if (peso <= 19) {
                precio = precio + 100;
            }
        }
        if (20 <= peso) {
            if (peso <= 49) {
                precio = precio + 500;
            }
        }
        if (50 <= peso) {
            if (peso <= 79) {
                precio = precio + 800;
            }
        }
        if (80 <= peso) {
            precio = precio + 1000;
        }
    }

    public void escribirDatos() {

        System.out.println("Precio: " + precio);
        System.out.println("Peso: " + peso);
        System.out.println("Color: " + color);
        System.out.println("Consumo energético: " + consumoEnergetico);

    }
}
