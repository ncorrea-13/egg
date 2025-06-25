package Enum;

public enum NewEnum {
    MARIA("Mari"), TUKI("Tuki"), TOBY("Toby"), CHOLO("Cholo"), PANCHA("Pancha");
    
    private String nombre;

    private NewEnum() {
    }

    private NewEnum(String nombre) {
        this.nombre = nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + '}';
    }

    

}
