package nexoedu;
public class Materia {
    private String nombre;
    private String hora;
    private Aula aula;
    private boolean disponible;

    public Materia(String nombre, String hora, Aula aula, boolean disponible) {
        this.nombre = nombre;
        this.hora = hora;
        this.aula = aula;
        this.disponible = disponible;
    }

    public String getNombre() { return nombre; }
    public Aula getAula() { return aula; }
    public boolean isDisponible() { return disponible; }

    @Override
    public String toString() {
        return nombre + " en " + aula + " a las " + hora + (disponible ? " (Disponible)" : " (No disponible)");
    }
}
