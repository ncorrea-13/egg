package ej4;

import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Circulo circulo = new Circulo();
        Rectangulo rectangulo = new Rectangulo();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Integer i;

        System.out.println("Que forma desea sacar los parámetros?");
        switch (leer.next().toLowerCase()) {
            case "circulo":
                i = 1;

                System.out.println("Dicte el radio del círculo");
                circulo.radio = leer.nextInt();

                do {

                    System.out.println("Que desea sacar?");

                    switch (leer.next().toLowerCase()) {

                        case "area":
                            circulo.areaCirculo();
                            break;

                        case "perimetro":
                            circulo.perimetroCirculo();

                        default:
                            System.out.println("Desea salir ");

                            switch (leer.next().toLowerCase()) {

                                case "si":
                                    i = 0;
                                    break;

                                default:
                                    i = 1;
                            }
                    }

                    System.out.println("======================================");

                } while (i == 1);
                
                System.out.println("El área es de " + circulo.areaRedonda);
                System.out.println("El perimetro es de " + circulo.perimetroRedondo);
                
                
                break;
            case "rectangulo":
                i = 1;

                System.out.println("Dicte el ancho del rectángulo");
                rectangulo.hancho = leer.nextDouble();

                System.out.println("Dicte el alto del rectángulo");
                rectangulo.altura = leer.nextDouble();

                do {
                    
                    
                    System.out.println("Que desea hacer?");

                    switch (leer.next().toLowerCase()) {
                        
                        case "area":
                            rectangulo.areaRectangulo();
                            break;
                            
                        case "perimetro":
                            rectangulo.perimetroRectangulo();
                            break;
                            
                        default:
                            System.out.println("Desea salir ");

                            switch (leer.next().toLowerCase()) {

                                case "si":
                                    i = 0;
                                    break;

                                default:
                                    i = 1;
                            }
                    }
                    
                    System.out.println("======================================");

                } while (i == 1);

                System.out.println("El area del rectángulo es de " + rectangulo.areaCuadrada);
                System.out.println("El perimetro del rectangulo es de " + rectangulo.perimetroCuadrado);
                
                
                break;
            default:
                System.out.println("Usted no dictó ninguna figura válida");
        }        
    }
}
