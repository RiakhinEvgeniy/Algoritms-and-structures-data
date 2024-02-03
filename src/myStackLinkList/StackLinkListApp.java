package myStackLinkList;

public class StackLinkListApp {
    public static void main(String[] args) {
        StackLinkList stackLinkList = new StackLinkList();

        stackLinkList.push(20);
        stackLinkList.push(40);
        stackLinkList.push(10);

        stackLinkList.printStack();

        stackLinkList.push(60);
        stackLinkList.push(80);

        stackLinkList.printStack();

        stackLinkList.pop();
        stackLinkList.pop();

        stackLinkList.printStack();
    }
}
