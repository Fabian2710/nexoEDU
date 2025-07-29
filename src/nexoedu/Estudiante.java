package nexoedu;
import java.util.ArrayList;

public class Estudiante extends Usuario {
    private ArrayList<Docente> docentes;
    private ArrayList<Material> materiales;
    private ArrayList<Aviso> avisos;

    public Estudiante(String nombre, String correo, String contrasena) {
        super(nombre, correo, contrasena);
        docentes = new ArrayList<>();
        materiales = new ArrayList<>();
        avisos = new ArrayList<>();
    }

    @Override
    public void verificarInformacionPersonal() {
        System.out.println("Verificando informacion de estudiante: " + nombre);
    }

    @Override
    public void editarInfo() {
        System.out.println("Editando informacion de estudiante: " + nombre);
    }

    public void agregarDocente(Docente d) {
        docentes.add(d);
    }

    public void agregarMaterial(Material m) {
        materiales.add(m);
    }

    public void agregarAviso(Aviso a) {
        avisos.add(a);
    }

    public ArrayList<Docente> getDocentes() {
        return docentes;
    }

    public ArrayList<Aviso> getAvisos() {
        return avisos;
    }
}
