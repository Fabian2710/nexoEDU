package nexoedu;
public class ControlMaterial {
    public void aprobarM(Material m) {
        m.setAprobado(true);
        System.out.println("Material aprobado: " + m.getTitulo());
    }

    public void banearMaterial(Material m) {
        m.setInapropiado(true);
        System.out.println("Material baneado: " + m.getTitulo());
    }
}
