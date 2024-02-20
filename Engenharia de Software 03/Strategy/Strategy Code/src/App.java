public class App {
    public static void main(String[] args) throws Exception {

        Cliente cliente = new Cliente();
        cliente.setCompra(new CinquentaAnos());
        cliente.fazerCompra(100.10);
}
}