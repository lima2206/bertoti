public class App {
    public static void main(String[] args) {

        Database db = Database.getDatabase();
        
        
        User user1 = new User("Alicia", 30);
        User user2 = new User("Pedro", 25);
        User user3 = new User("Matheus", 28);
        
        db.addUser(user1);
        db.addUser(user2);
        db.addUser(user3);
                
        System.out.println("Users:");
        db.showUsers();
                
        db.removeUser(user2);
                
        System.out.println("\nUsers:");
        db.showUsers();
    }
}