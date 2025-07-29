package nexoedu;
import java.util.ArrayList;

public class GeoLocalizacion {
    public ArrayList<String> buscarUbicacion(String tipo) {
        ArrayList<String> ubicaciones = new ArrayList<>();
        if (tipo.equalsIgnoreCase("wifi")) {
            ubicaciones.add("Edificio A - Piso 1");
            ubicaciones.add("Edificio B - Piso 2");
        } else if (tipo.equalsIgnoreCase("oficina")) {
            ubicaciones.add("Oficina Central");
            ubicaciones.add("Oficina Administración");
        }
        return ubicaciones;
    }
}
