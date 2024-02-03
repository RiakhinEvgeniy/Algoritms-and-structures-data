package mylinkedlist;

public class FirstLastListApp {
    public static void main(String[] args) {
        FirstLastList fll = new FirstLastList();
        fll.insertFirst(22);
        fll.insertFirst(44);
        fll.insertFirst(66);

        fll.insertLast(11);
        fll.insertLast(33);
        fll.insertLast(55);

        fll.displayFirstLastList();

        fll.deleteFirst();
        fll.deleteFirst();

        fll.displayFirstLastList();
    }
}
