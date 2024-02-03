package mylinkedlist;

public class LinkListApp {
    public static LinkList linkList = new LinkList();

    public static void main(String[] args) {

        linkList.insertFirst(0, 53.99);
        linkList.insertFirst(1, 25.3);
        linkList.insertFirst(2, 0.52);
        linkList.insertFirst(3, 256.3);
        linkList.insertFirst(4, 100.0);

        linkList.displayList();

        deleteByKey(2);

        linkList.displayList();

        //deleteFirst();

        System.out.println();

        linkList.displayList();
    }

    public static void deleteByKey(int key) {

        Link del = linkList.deleteByKey(key);

        if (del == null) {
            System.out.println("Key don't find!");
        } else {
            System.out.println("Deleted element: " + del.iData);
        }
    }

    public static void deleteFirst() {
        Link deleted = linkList.deleteFirst();
        deleted.displayDataLink();
    }
}
