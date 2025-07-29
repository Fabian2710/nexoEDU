package nexoedu;
public class UsuarioInvitado extends Usuario {
    public UsuarioInvitado() {
        super("Invitado", "inv@ejemplo.com", "");
    }

    public void ingresarComoInvitado() {
        System.out.println("Ingresando como invitado...");
    }

    @Override
    public void verificarInformacionPersonal() {
        System.out.println("No disponible para invitados.");
    }

    @Override
    public void editarInfo() {
        System.out.println("No disponible para invitados.");
    }
}
