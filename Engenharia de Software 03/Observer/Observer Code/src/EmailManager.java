import java.util.ArrayList;

public class EmailManager {

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private ArrayList<Subscriber> subscriberList = new ArrayList();
    
    private Email email = new Email("Email teste", "27/02/2024");
    
    public void subscribe(Subscriber subscriber){

        this.subscriberList.add(subscriber);

    }

    public void unsubscribe(Subscriber subscriber){

        this.subscriberList.remove(subscriber);

    }

    public void sendEmail(){

        for (Subscriber subscriber : this.subscriberList) {
            
            subscriber.notify(this.email);

        }
    }
}