package nexoedu;
public class Material {
    private String titulo;
    private String link;
    private String autor;
    private boolean esAprobado;
    private boolean esInapropiado;

    // Constructor
    public Material(String titulo, String link, String autor) {
        this.titulo = titulo;
        this.link = link;
        this.autor = autor;
        this.esAprobado = false;
        this.esInapropiado = false;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public String getLink() { return link; }
    public String getAutor() { return autor; }
    public boolean isAprobado() { return esAprobado; }
    public void setAprobado(boolean aprobado) { this.esAprobado = aprobado; }
    public boolean isInapropiado() { return esInapropiado; }
    public void setInapropiado(boolean inapropiado) { this.esInapropiado = inapropiado; }

    @Override
    public String toString() {
        return "Material: " + titulo + " (" + autor + ")";
    }
}
