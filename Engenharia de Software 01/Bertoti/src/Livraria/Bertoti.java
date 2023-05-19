/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Livraria;

/**
 *
 * @author Lima
 */
public class Bertoti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Livro duna = new Livro(1, "Duna", "Frank Herbert", "Chilton books", 50.00);
        
        Cliente vitor = new Cliente(12, "Vitor Spricigo Lima", 123456789, 129830400);
        
        Venda compra = vitor.comprarLivro(duna, vitor);
        
        System.out.println("Cliente: "+compra.getCliente().getNome());
        System.out.println("Data da Venda: "+compra.getDataVenda());
        System.out.println("Livro: "+compra.getLivro().getNome());
        System.out.println("Valor da Compra: R$"+compra.getValorVenda());
        
    }
    
}
