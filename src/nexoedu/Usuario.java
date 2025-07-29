package nexoedu;
public abstract class Usuario {
    protected String nombre;
    protected String correo;
    protected String contrasena;

    public Usuario(String nombre, String correo, String contrasena) {
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
    }

    public abstract void verificarInformacionPersonal();
    public abstract void editarInfo();
}
