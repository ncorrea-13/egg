package Objects;

public class Alumno {

    private String nombre;
    private Integer N1, N2, N3, Promedio;

    public Alumno(String nombre, Integer N1, Integer N2, Integer N3) {
        this.nombre = nombre;
        this.N1 = N1;
        this.N2 = N2;
        this.N3 = N3;
    }

    public Alumno() {
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setN1(Integer N1) {
        this.N1 = N1;
    }

    public void setN2(Integer N2) {
        this.N2 = N2;
    }

    public void setN3(Integer N3) {
        this.N3 = N3;
    }

    public void setPromedio(Integer Promedio) {
        this.Promedio = Promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getN1() {
        return N1;
    }

    public Integer getN2() {
        return N2;
    }

    public Integer getN3() {
        return N3;
    }

    public Integer getPromedio() {
        return Promedio;
    }

}
