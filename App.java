public class App {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insert(1);
        l.insert(2);
        l.insert(3);
        l.insert(3);
        l.insert(1);

        System.out.println(l.isPalindrome());
    }
}