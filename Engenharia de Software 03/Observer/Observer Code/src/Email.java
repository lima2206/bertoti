

public class Email {

    private String message;
    private String date;

    public Email(String message, String date){

        this.message = message;
        this.date = date;

    }

    public String getMessage() {
        return message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}