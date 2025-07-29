package nexoedu;
public class PromptBusqueda {
    private String texto;
    private String tipo;

    public PromptBusqueda(String texto, String tipo) {
        this.texto = texto;
        this.tipo = tipo;
    }

    public String getTexto() { return texto; }
    public String getTipo() { return tipo; }
}
