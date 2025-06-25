package ej4;

public class Rectangulo implements calculosFormula {

    Double areaCuadrada, perimetroCuadrado, altura, hancho;

    @Override
    public void perimetroRectangulo() {
        perimetroCuadrado = (altura + hancho) * 2;
    }

    @Override
    public void areaRectangulo() {
        areaCuadrada = altura * hancho;
    }

    @Override
    public void areaCirculo() {
    }

    @Override
    public void perimetroCirculo() {
    }
}
