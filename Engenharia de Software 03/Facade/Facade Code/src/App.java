import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Cria uma nova instância da biblioteca
        Biblioteca biblioteca = new Biblioteca();

        // Cria e registra um novo usuário
        Usuario usuario1 = new Usuario(1, "John Doe", 30, "123 Main St");
        biblioteca.cadastrarUsuario(usuario1);

        // Cria e adiciona um novo livro
        Livro livro1 = new Livro(1, "The Great Gatsby", "F. Scott Fitzgerald", "Fiction", new Date());
        biblioteca.catDeLiv.adicionarLivro(livro1);

        // Checa se o usuario e o livro são validos
        System.out.println("Usuário valido: " + biblioteca.gerDeUsu.verificarUsuarioValido(usuario1.getId())); // true
        System.out.println("Livro disponível: " + biblioteca.catDeLiv.verificarLivroDisponivel(livro1.getId())); // true

        // Empresta o livro
        biblioteca.fazerEmprestimo(usuario1.getId(), livro1.getId());

        // Verifica se o livro está emprestado
        System.out.println("Livro emprestado pelo usuário: " + biblioteca.conDeEmp.verificarEmprestimo(usuario1.getId(), livro1.getId())); // true

        // Devolver o livro
        biblioteca.devolverLivro(usuario1.getId(), livro1.getId());

        // Verifica se o Livro está emprestado
        System.out.println("Livro emprestado pelo Usuário: " + biblioteca.conDeEmp.verificarEmprestimo(usuario1.getId(), livro1.getId()));
    }
}