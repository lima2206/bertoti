public class Cliente {
    private Compra compra;

    public void setCompra(Compra comp){
        compra = comp;
    }

    public void fazerCompra(double valor){
        compra.comprar(valor);
    }

}
