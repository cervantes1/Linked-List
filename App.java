public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(4);
        l.insert(5);
        l.insert(89);
        l.insert(46);
        l.display();

        System.out.println("---------");
        l.delete(47);
        l.display();
    }
}