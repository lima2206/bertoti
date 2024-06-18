import java.util.ArrayList;
import java.util.List;

public class CatalogoDeLivros {
    private List<Livro> livros = new ArrayList<>();

    public boolean verificarLivroDisponivel(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return true;
            }
        }
        return false;
    }

    public Livro buscarLivro(int livroId) {
        for (Livro livro : livros) {
            if (livro.getId() == livroId) {
                return livro;
            }
        }
        return null;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void removerLivro(Livro livro) {
        livros.removeIf(l -> l.getId() == livro.getId());
    }
}
