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

        /**
         * При первом добавлении, переменная current равна null и мы не заходим в while
         * и присваевываем first ссылку на первый объект.
         * При втором добавлении, заходим в while и присваевываем previous текущий объект
         * а current присив. current.next который равен в данный момент null.
         *
         */
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
