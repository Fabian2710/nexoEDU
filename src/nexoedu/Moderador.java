package nexoedu;
import java.util.ArrayList;

public class Moderador {
    public void aprobarMaterial(Material m) {
        m.setAprobado(true);
        System.out.println("Material aprobado: " + m.getTitulo());
    }

    public ArrayList<Reporte> revisarReportes() {
        return new ArrayList<>();
    }

    public void banearUsuario(Usuario u) {
        System.out.println("Usuario baneado: " + u.nombre);
    }
}
