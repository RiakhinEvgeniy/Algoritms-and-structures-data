package myStackLinkList;

public class StackLinkList {
    private LinkList linkList;

    public StackLinkList() {
        this.linkList = new LinkList();
    }

    public final void push(int iData) {
        linkList.insertFirst(iData);
    }

    public final int pop() {
        return linkList.delete();
    }

    public final void printStack() {
        System.out.print("Stack (top->bottom): ");
        linkList.displayList();
    }

    public final boolean isEmpty() {
        return linkList.isEmpty();
    }
}
