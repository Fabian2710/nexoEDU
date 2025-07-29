package nexoedu;
public class Aviso {
    private String mensaje;
    private String tipo;

    public Aviso(String mensaje, String tipo) {
        this.mensaje = mensaje;
        this.tipo = tipo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "[" + tipo + "] " + mensaje;
    }
}
