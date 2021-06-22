public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(4);
        l.insert(5);
        l.insert(6);

        l.display();

        System.out.println("---------");
        l.deleteMiddle();
        l.display();
    }
}