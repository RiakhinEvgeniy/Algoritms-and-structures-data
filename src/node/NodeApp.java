package node;

public class NodeApp {
    public static void main(String[] args) {
        int count = 10;
        Node tail = null;
        for (int i = 0; i < count; i++) {
            tail = new Node(i, tail);
        }
        Node ref = tail;
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}
