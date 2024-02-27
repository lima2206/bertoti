public class Subscriber implements EmailSubscriber {
    
    private String nome;

    public Subscriber(String nome){
        this.nome = nome;
    }

    public void notify(Email email){
        
        System.out.println("Email: '" + email.getMessage() + "' com data: "+ email.getDate() +" | Recebido por: " + this.nome);
    }

}
