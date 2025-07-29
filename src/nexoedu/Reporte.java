package nexoedu;
public class Reporte {
    private Material material;
    private String motivo;

    public Reporte(Material material, String motivo) {
        this.material = material;
        this.motivo = motivo;
    }

    public void procesar() {
        System.out.println("Procesando reporte: " + motivo + " sobre " + material.getTitulo());
    }
}
