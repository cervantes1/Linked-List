public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(2);
        l.insert(2);
        l.insert(6);
        l.insert(8);
        l.insert(9);

        l.display();

        System.out.println("---------");
        l.removeDuplicates();
        l.display();
    }
}