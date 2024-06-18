import java.util.ArrayList;
import java.util.List;

public class ControleDeEmprestimos {
    private List<Emprestimo> emprestimos = new ArrayList<>();

    public void registrarEmprestimo(int usuarioId, int livroId) {
        emprestimos.add(new Emprestimo(usuarioId, livroId));
    }

    public void registrarDevolucao(int usuarioId, int livroId) {
        emprestimos.removeIf(e -> e.getUsuarioId() == usuarioId && e.getLivroId() == livroId);
    }

    public boolean verificarEmprestimo(int usuarioId, int livroId) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getUsuarioId() == usuarioId && emprestimo.getLivroId() == livroId) {
                return true;
            }
        }
        return false;
    }
}

class Emprestimo {
    private int usuarioId;
    private int livroId;

    public Emprestimo(int usuarioId, int livroId) {
        this.usuarioId = usuarioId;
        this.livroId = livroId;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    public int getLivroId() {
        return livroId;
    }
}
