public class Leaf implements Component {

    private int id;
    
    public Leaf(int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void doSomething() {
        System.out.println("Leaf " + this.id);
    }

    
}
