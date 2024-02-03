package Arrays;

import java.util.Date;

public class SelectSortApp {
    public static void main(String[] args) {
        int size = 10;
        SelectSort selectSort = new SelectSort(size);
        for (int i = 0; i < 10; i++) {
            selectSort.insert((int) (Math.random() * 100));
        }
        selectSort.display();
        //System.out.println();
        Date start = new Date();
        selectSort.selectSort();
        Date end = new Date();
        long res = end.getTime() - start.getTime();
        System.out.println("\n" + res);
        selectSort.display();
    }
}
