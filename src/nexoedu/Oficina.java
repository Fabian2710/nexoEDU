package nexoedu;
public class Oficina {
    private String nombre;
    private String ubicacion;

    public Oficina(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre + " (" + ubicacion + ")";
    }
}
