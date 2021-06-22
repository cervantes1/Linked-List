public class LinkedList {
    Node root;

    class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public LinkedList() {
        root = null;
    }

    public void insert(int val) {
        if (root == null) {
            root = new Node(val);
            return;
        }

        Node n = new Node(val);
        Node curr = root;

        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = n;
    }

    public void delete(int val) {
        if (root == null)
            return;

        if (root.val == val) {
            root = root.next;
            return;
        }

        Node curr = root;

        while (curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next;
                return;
            }
            curr = curr.next;
        }

        throw new Error("Invalid value");

    }

    public void display() {
        Node curr = root;
        while (curr != null) {
            System.out.println(curr.val);
            curr = curr.next;
        }
    }
}
