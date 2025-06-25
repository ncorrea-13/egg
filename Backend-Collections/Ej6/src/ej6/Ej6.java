package ej6;

import java.util.HashMap;
import java.util.Scanner;

public class Ej6 {

    public static void main(String[] args) {
        HashMap<String, Integer> Lista = new HashMap();
        Scanner leer = new Scanner(System.in);
        boolean Razon = true;
        String rta;

        while (Razon == true) {
            System.out.println("Desea agregar otro producto?");
            rta = leer.next();
            switch (rta) {
                case "S":
                case "si":
                case "Si":
                    crearProducto(leer, Lista);
                    Razon = true;
                    break;
                case "N":
                case "no":
                case "No":
                    Razon = false;
                    break;
                default:
                    Razon = true;
                    break;
            }
        }

        String Producto = seleccionDeProducto(leer, Lista);

        System.out.println("Desea cambiar su precio?");
        rta = leer.next();

        switch (rta) {
            case "S":
            case "si":
            case "Si":
                modificarPrecio(Lista, leer, Producto);
                break;
        }

        System.out.println("Desea eliminarlo?");
        rta = leer.next();

        switch (rta) {
            case "S":
            case "si":
            case "Si":
                Lista.remove(Producto);
                break;
        }

        System.out.println("Desea ver todos sus productos?");
        rta = leer.next();

        switch (rta) {
            case "S":
            case "si":
            case "Si":
                mostrarProductos(Lista);
                break;
        }

    }

    public static void crearProducto(Scanner leer, HashMap<String, Integer> Lista) {
        System.out.println("Que producto desea agregar?");
        String Nombre = leer.next();

        System.out.println("Cuál es su precio?");
        Integer Precio = leer.nextInt();

        Lista.put(Nombre, Precio);
    }

    public static String seleccionDeProducto(Scanner leer, HashMap<String, Integer> Lista) {
        boolean Razon = false;
        String Producto = null;
        while (Razon == false) {
            System.out.println("Cual es el nombre de su producto?");
            Producto = leer.next();
            if (!Lista.containsKey(Producto)) {
                System.out.println("Su producto no se encuentra en la lista");
                System.out.println("Repita el paso");
                Razon = false;
            } else {
                Razon = true;
            }
        }

        return Producto;
    }

    public static void modificarPrecio(HashMap<String, Integer> Lista, Scanner leer, String Nombre) {
        Lista.remove(Nombre);

        System.out.println("Cual es el nuevo precio de su producto?");
        Integer precioNuevo = leer.nextInt();

        Lista.put(Nombre, precioNuevo);
    }

    public static void mostrarProductos(HashMap<String, Integer> Lista) {
        Lista.entrySet().forEach((entry) -> {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Nombre = " + key + ",  precio = " + value);
        });
    }
}
