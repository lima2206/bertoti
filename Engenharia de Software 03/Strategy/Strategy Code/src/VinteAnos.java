
public class VinteAnos implements Compra{
    
    public double comprar(double valor){

        // Teste no Console

        System.out.println( valor - (valor * 20/100));

        return valor - (valor * 20/100);

    }

}