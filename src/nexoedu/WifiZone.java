package nexoedu;
public class WifiZone {
    private String nombre;
    private String ubicacion;

    public WifiZone(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return nombre + " (" + ubicacion + ")";
    }
}
