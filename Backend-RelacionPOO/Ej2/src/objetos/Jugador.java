package objetos;

public class Jugador {

    private String nombre;
    private boolean mojado = true;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

       
    public boolean disparo(Pistola r) {
        
        r.siguienteChorro();
        mojado = r.mojar();        
        return mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", mojado=" + mojado + '}';
    }
    
    
}
