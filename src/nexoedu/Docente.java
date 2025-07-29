package nexoedu;
public class Docente {
    private int id;
    private String nombre;
    private float calificacion;

    public Docente(int id, String nombre, float calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    public DatosDocente getPerfil() {
        return new DatosDocente(nombre, calificacion);
    }

    @Override
    public String toString() {
        return nombre + " (id: " + id + ", calificacion: " + calificacion + ")";
    }
}
