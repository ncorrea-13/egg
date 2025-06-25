package extra1;

import java.util.ArrayList;
import java.util.Scanner;

public class Extra1 {

    public static void main(String[] args) {
        ArrayList<Integer> Lista = new ArrayList();
        Scanner leer = new Scanner(System.in);
        boolean mientras = true;
        Integer suma = 0;

        while (mientras == true) {
            System.out.println("Ingrese un número");
            int nro = leer.nextInt();

            if (nro == -99) {
                break;
            } else {
                Lista.add(nro);
            }
        }

        Lista.forEach((next) -> {
            System.out.print("/ " + next + " /");
        });
        System.out.println("");

        for (Integer next : Lista) {
            suma = suma + next;
        }

        System.out.println(suma + " es la suma de todos sus valores");
        Integer medio = suma / Lista.size();
        System.out.println(medio + " es el promedio de los valores");
    }

}
