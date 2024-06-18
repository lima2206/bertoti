public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("---------------");
        Branch branch1 = new Branch();

        Leaf l1 = new Leaf(1);
        Leaf l2= new Leaf(2);
        Leaf l3= new Leaf(3);

        branch1.add(l1);
        branch1.add(l2);
        branch1.add(l3);

    }
}
