
public class QuarentaAnos implements Compra{
    
    public double comprar(double valor){

        // Teste no Console

        System.out.println( valor - (valor * 40/100));

        return valor - (valor * 40/100);

    }

}