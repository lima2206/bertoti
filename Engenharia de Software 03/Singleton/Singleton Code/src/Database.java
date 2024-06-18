import java.util.ArrayList;

public class Database {
    private static Database instance;
    private ArrayList<User> users;

    // Private constructor to prevent instantiation
    private Database() {
        users = new ArrayList<>();
    }

    // Static method to get the single instance of the class
    public static Database getDatabase() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public void showUsers() {
        for (User user : users) {
            System.out.println(user);
        }
    }
}