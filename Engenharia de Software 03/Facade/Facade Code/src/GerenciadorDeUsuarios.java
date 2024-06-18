import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeUsuarios {
    private List<Usuario> usuarios = new ArrayList<>();

    public boolean verificarUsuarioValido(int usuarioId) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioId) {
                return true;
            }
        }
        return false;
    }

    public void cadastrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario getUsuario(int usuarioId) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == usuarioId) {
                return usuario;
            }
        }
        return null;
    }
}
