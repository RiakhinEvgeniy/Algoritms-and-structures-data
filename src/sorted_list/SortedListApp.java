package sorted_list;

public class SortedListApp {
    public static void main(String[] args) {
        SortedList sortedList = new SortedList();
        sortedList.insert(3);
        sortedList.insert(5);
        sortedList.insert(7);

        sortedList.displaySortedList();

        sortedList.insert(4);

        sortedList.displaySortedList();
    }
}
