package nexoedu;
import java.util.ArrayList;

public class Horario {
    private ArrayList<Materia> materias;
    private ArrayList<Aula> aulas;

    public Horario() {
        materias = new ArrayList<>();
        aulas = new ArrayList<>();
    }

    public void agregarMateria(Materia m) {
        materias.add(m);
        if (!aulas.contains(m.getAula())) {
            aulas.add(m.getAula());
        }
    }

    public void exportar() {
        System.out.println("Exportando horario a PDF...");
    }

    public void descargar() {
        System.out.println("Descargando horario...");
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Horario:\n");
        for (Materia m : materias) {
            sb.append("- ").append(m).append("\n");
        }
        return sb.toString();
    }
}
