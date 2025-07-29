package nexoedu;
public class DatosDocente {
    private String nombre;
    private float calificacion;

    public DatosDocente(String nombre, float calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Docente: " + nombre + ", calificacion: " + calificacion;
    }
}
