/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Livraria;

import java.util.Date;

/**
 *
 * @author Lima
 */
public class Venda {
    private Cliente cliente;
    private Livro livro;
    private double valorVenda;
    private Date dataVenda;

    public Venda(Cliente cliente, Livro livro, double valorVenda, Date dataVenda) {
        this.cliente = cliente;
        this.livro = livro;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Livro getLivro() {
        return livro;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public void setDataVenda(Date dataVenda) {
        this.dataVenda = dataVenda;
    }
    
}
    
    
