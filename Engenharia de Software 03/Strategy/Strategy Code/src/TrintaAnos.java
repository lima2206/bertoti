
public class TrintaAnos implements Compra{
    
    public double comprar(double valor){

        // Teste no Console

        System.out.println( valor - (valor * 30/100));

        return valor - (valor * 30/100);

    }

}