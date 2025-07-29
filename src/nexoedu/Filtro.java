package nexoedu;
import java.util.HashMap;
import java.util.Map;

public class Filtro {
    private Map<String, String> criterios;

    public Filtro() {
        criterios = new HashMap<>();
    }

    public void agregarCriterio(String clave, String valor) {
        criterios.put(clave, valor);
    }

    public String getCriterio(String clave) {
        return criterios.get(clave);
    }
}
