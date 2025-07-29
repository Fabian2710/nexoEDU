package nexoedu;
public class Aula {
    private String nombre;
    private String edificio;

    public Aula(String nombre, String edificio) {
        this.nombre = nombre;
        this.edificio = edificio;
    }

    @Override
    public String toString() {
        return nombre + " (" + edificio + ")";
    }
}
