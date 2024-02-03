package myStackLinkList;

public class Link {
    protected int iData;
    protected Link next;

    public Link(int iData) {
        this.iData = iData;
        this.next = null;
    }

    protected void displayDataLink() {
        System.out.print("{" + iData + "}; ");
    }
}
