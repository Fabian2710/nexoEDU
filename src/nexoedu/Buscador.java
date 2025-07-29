package nexoedu;
import java.util.ArrayList;

public class Buscador {
    // Puedes buscar por nombre o con filtro
    public ArrayList<Docente> buscarDocente(Filtro filtro, ArrayList<Docente> docentes) {
        ArrayList<Docente> resultados = new ArrayList<>();
        for (Docente d : docentes) {
            // Ejemplo simple: buscar por un criterio "nombre"
            String criterioNombre = filtro.getCriterio("nombre");
            if (criterioNombre != null && d.toString().contains(criterioNombre)) {
                resultados.add(d);
            }
        }
        return resultados;
    }
}
