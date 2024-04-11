package Models;

public class Node {
    int data;
    Node next;
    public Node() {
        this.next = null;
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}
