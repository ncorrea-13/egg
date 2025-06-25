package Objetos;

import Enum.NewEnum;

public class Perro {

    private NewEnum nombre;
    private Persona dueno;

    public Perro() {
    }

    public Perro(NewEnum nombre) {
        this.nombre = nombre;
    }

    public NewEnum getNombre() {
        return nombre;
    }

    public void setNombre(NewEnum nombre) {
        this.nombre = nombre;
    }

    public void setDueno(Persona dueno) {
        this.dueno = dueno;
    }

    public Persona getDueno() {
        return dueno;
    }

    @Override
    public String toString() {
        return "Perro=" + nombre;
    }

}
