package mylinkedlist;

public class LinkList {

    private Link first;

    public LinkList() {
        first = null;
    }

    public void insertFirst(int iData, double dData) {
        Link newLink = new Link(iData, dData);
        newLink.next = first;
        first = newLink;
    }

    public final Link deleteFirst() {
        if (isEmpty()) {
            throw new RuntimeException("Link list is empty!!!");
        } else {
            Link tmp = first;
            first = first.next;
            return tmp;
        }
    }

    public final double delete() {
        if (isEmpty()) throw new RuntimeException("Link list is empty");

        double tmp = first.dData;

        first = first.next;

        return tmp;
    }

    public Link findByKey(int key) {
        Link current = first;
        if (isEmpty()) {
            throw new RuntimeException("Link list is empty!!!");
        } else {
            while (current.iData != key) {
                if (current.next == null) {
                    return null;
                } else {
                    current = current.next;
                }
            }
        }
        return current;
    }

    public Link deleteByKey(int key) {
        Link current = first;
        Link previous = first;
        if (isEmpty()) {
            throw new RuntimeException("Link list is empty!!!");
        } else {
            while (current.iData != key) {
                if (current.next == null) {
                    return null;
                } else {
                    previous = current;
                    current = current.next;
                }
            }

            if (current == first) {
                first = first.next;
            } else {
                previous.next = current.next;
            }
        }
        return current;
    }

    protected boolean isEmpty() {
        return (first == null);
    }

    public void displayList() {
        System.out.print("List (first --> last): ");
        Link current = first;
        while (current != null) {
            current.displayDataLink();
            current = current.next;
        }
        System.out.println("");
    }
}
