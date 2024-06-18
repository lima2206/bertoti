public class Biblioteca {
    GerenciadorDeUsuarios gerDeUsu;
    ControleDeEmprestimos conDeEmp;
    CatalogoDeLivros catDeLiv;

    public Biblioteca() {
        gerDeUsu = new GerenciadorDeUsuarios();
        conDeEmp = new ControleDeEmprestimos();
        catDeLiv = new CatalogoDeLivros();
    }

    public void fazerEmprestimo(int usuarioId, int livroId) {
        if (gerDeUsu.verificarUsuarioValido(usuarioId) && catDeLiv.verificarLivroDisponivel(livroId)) {
            conDeEmp.registrarEmprestimo(usuarioId, livroId);
        }
    }

    public void devolverLivro(int usuarioId, int livroId) {
        if (conDeEmp.verificarEmprestimo(usuarioId, livroId)) {
            conDeEmp.registrarDevolucao(usuarioId, livroId);
        }
    }

    public void cadastrarUsuario(Usuario usuario) {
        gerDeUsu.cadastrarUsuario(usuario);
    }

    public Livro buscarLivro(int livroId) {
        return catDeLiv.buscarLivro(livroId);
    }
}