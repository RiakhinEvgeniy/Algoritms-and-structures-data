package mylinkedlist;

public class Link {
    protected int iData;
    protected double dData;
    protected Link next;

    public Link(int iData, double dData) {
        this.iData = iData;
        this.dData = dData;
        this.next = null;
    }

    protected void displayDataLink() {
        System.out.print("{" + iData + ", " + dData + "}; ");
    }
}
