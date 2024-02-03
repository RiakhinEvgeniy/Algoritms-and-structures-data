package mylinkedlist;

public class FirstLastList {
    private Link first;
    private Link last;

    public FirstLastList() {
        this.first = null;
        this.last = null;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public void insertFirst(double value) {
        Link newLink = new Link(0, value);
        if (isEmpty()) {
            last = newLink;
        }
        newLink.next = first;
        first = newLink;
    }

    public void insertLast(double value) {
        Link newLink = new Link(0, value);
        if (isEmpty()) {
            first = newLink;
        } else {
            last.next = newLink;
        }
        last = newLink;
    }

    public final double deleteFirst() {
        if (isEmpty()) throw new RuntimeException("List is empty");

        double tmp = first.dData;

        if (first.next == null) {
            last = null;
        }
        first = first.next;

        return tmp;
    }

    public void displayFirstLastList() {
        System.out.print("List (first-->last): ");
        Link current = first;
        while (current != null) {
            current.displayDataLink();
            current = current.next;
        }
        System.out.println();
    }
}
