import java.util.ArrayList;

public class Branch implements Component {
    
    private ArrayList<Component> children = new ArrayList<>();

    public void add(Component child){
        children.add(child);
    }

    public void remove(Component child){
        children.remove(child);
    }


    public void doSomething() {
        for (Component component : children) {
            component.doSomething();
        }
    }

}
