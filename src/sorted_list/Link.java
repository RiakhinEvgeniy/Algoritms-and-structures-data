package sorted_list;

public class Link {
    public long data;
    Link next;

    public Link(long data) {
        this.data = data;
        this.next = null;
    }

    protected void displayLink() {
        System.out.print(data + " ");
    }
}
