public class App {
    public static void main(String[] args) throws Exception {

        EmailManager emailManager = new EmailManager();

        Subscriber subscriber01 = new Subscriber("Vitor");
        Subscriber subscriber02 = new Subscriber("Isaque");
        Subscriber subscriber03 = new Subscriber("Pedro");
        Subscriber subscriber04 = new Subscriber("Matheus");

        System.out.println("----------------------------");
        emailManager.subscribe(subscriber01);
        emailManager.subscribe(subscriber02);
        emailManager.subscribe(subscriber03);
        emailManager.subscribe(subscriber04);

        emailManager.sendEmail();

        System.out.println("----------------------------");

        emailManager.unsubscribe(subscriber02);
        emailManager.unsubscribe(subscriber04);

        emailManager.sendEmail();

        System.out.println("----------------------------");
        
    }
}
