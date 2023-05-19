/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

/**
 *
 * @author Lima
 */
public class Livro {
    private int idLivro;
    private String nome;
    private String autor;
    private String editora;
    private double preco;

    public Livro(int idLivro, String nome, String autor, String editora, double preco) {
        this.idLivro = idLivro;
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.preco = preco;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public String getNome() {
        return nome;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
