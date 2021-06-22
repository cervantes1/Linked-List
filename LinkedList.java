import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    public void removeDuplicates() {
        if (root == null)
            return;
        Map<Integer, Integer> map = new HashMap<>();
        Node curr = root;
        while (curr != null) {
            if (map.containsKey(curr.val)) {
                int freq = map.get(curr.val);
                freq++;
                map.put(curr.val, freq);
            } else {
                map.put(curr.val, 1);
            }
            curr = curr.next;
        }

        curr = root;
        while (curr.next != null) {
            int freq = map.get(curr.val);
            if (freq > 1) {
                delete(curr.val);
            }
            curr = curr.next;
        }
    }

    public int kthNode(int n) {
        if (root == null)
            return -1;

        Node curr = root;
        int size = 0;
        while (curr != null) {
            size++;
            curr = curr.next;
        }

        curr = root;
        size -= n;
        for (int i = 0; i < size; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void deleteMiddle() {

    }
}
