package Arrays.bubble_sort;

import java.util.Date;

public class BubbleSortApp {
    public static void main(String[] args) {
        int size = 1000;
        BubbleSort bubbleSort = new BubbleSort(size);
        for (int i = 0; i < 25; i++) {
            int n = (int)(Math.random() * 100);
            bubbleSort.insert(n);
        }

        bubbleSort.display();
        System.out.println();
        Date start = new Date();
        bubbleSort.bubbleSort();
        Date end = new Date();
        double res = end.getTime() - start.getTime();
        System.out.println("Time " + res / 1000);
        bubbleSort.display();
    }
}
