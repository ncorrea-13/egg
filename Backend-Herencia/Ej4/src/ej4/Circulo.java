package ej4;

public class Circulo implements calculosFormula {

    public Double areaRedonda, perimetroRedondo;
    public Integer radio;

    public Circulo() {
    }

    public Circulo(Double areaRedonda, Double perimetroRedondo, Integer radio) {
        this.areaRedonda = areaRedonda;
        this.perimetroRedondo = perimetroRedondo;
        this.radio = radio;
    }

    @Override
    public void areaCirculo() {
        areaRedonda = PI * radio * radio;
    }

    @Override
    public void perimetroCirculo() {
        perimetroRedondo = PI * radio * 2;
    }

    @Override
    public void perimetroRectangulo() {
    }

    @Override
    public void areaRectangulo() {
    }
}
