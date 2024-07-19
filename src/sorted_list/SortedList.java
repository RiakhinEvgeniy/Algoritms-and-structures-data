package sorted_list;

public class SortedList {
    private Link first;

    public SortedList() {
        this.first = null;
    }

    protected boolean isEmpty() {
        return first == null;
    }

    protected void insert(long key) {
        Link newLink = new Link(key);//создание нового элемента
        Link previous = null;       //от начала списка
        Link current = first;       //до конца

        while (current != null && key > current.data) {
            previous = current;
            current = current.next;
        }
        if (previous == null) { //если мы в начале списка
            first = newLink;
        } else {
            previous.next = newLink;
        }
        newLink.next = current;
    }

    protected void displaySortedList() {
        System.out.print("first-->last ");
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
