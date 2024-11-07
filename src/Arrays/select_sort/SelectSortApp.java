package Arrays.select_sort;

public class SelectSortApp {
    public static void main(String[] args) {
        int size = 10;
        SelectSort selectSort = new SelectSort(size);
        for (int i = 0; i < 10; i++) {
            selectSort.insert((int) (Math.random() * 100));
        }
        selectSort.display();
        selectSort.selectSort();
        System.out.println();
        selectSort.display();
    }
}
