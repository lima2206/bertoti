/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Lima
 */
public class Cliente {
    private int idCliente;
    private String nome;
    private int cpf;
    private int telefone;
    private Date datavenda = java.sql.Date.valueOf(LocalDate.now());
    
    
    public Venda comprarLivro(Livro livro, Cliente cliente){
        Venda venda = new Venda(cliente, livro, livro.getPreco(), this.datavenda);
        return venda;
    }
    
    public Cliente(int idCliente, String nome, int cpf, int telefone) {
        this.idCliente = idCliente;
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    
    
}
