package node;

public class NodeApp1 {
    public static void main(String[] args) {
        int count = 10;
        Node tail = null;
        for (int i = 0; i < count; i++) {
            tail = new Node(i, tail);
        }

        System.out.println(toStringIteration(tail));
        System.out.println(toStringRec(tail));
    }

    static String toStringIteration(Node ref) {
        String result = "";
        while (ref != null) {
            result += "(" + ref.value + ") ->";
            ref = ref.next;
        }
        result += "null";
        return result;
    }

    static String toStringRec(Node ref) {
        if (ref == null) {
            return "null";
        } else {
            return "(" + ref.value + ") ->" + toStringRec(ref.next);
        }
    }
}
