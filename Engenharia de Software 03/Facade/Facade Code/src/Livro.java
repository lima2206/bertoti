import java.util.Date;

public class Livro {
    private int id;
    private String titulo;
    private String autor;
    private String assunto;
    private Date anoPublicacao;

    public Livro(int id, String titulo, String autor, String assunto, Date anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.assunto = assunto;
        this.anoPublicacao = anoPublicacao;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAssunto() {
        return assunto;
    }

    public void setAssunto(String assunto) {
        this.assunto = assunto;
    }

    public Date getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Date anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
}
