public class LinkedList {
    Node root;

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    public LinkedList() {
        root = null;
    }

    public void insert(int data) {
        if (root == null) {
            root = new Node(data);
            root.next = null;
            return;
        }

        Node n = new Node(data);
        Node curr = root;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
    }

    public void display() {
        Node curr = root;
        while (curr != null) {
            System.out.println(curr.data);
            curr = curr.next;
        }
    }
}
