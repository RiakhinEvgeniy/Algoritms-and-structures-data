package Arrays;

import java.util.Date;

public class CheckTimeForSort {

    private static int size = 10;
    private static int randomNam = 100;

    public static void main(String[] args) {

        bubbleTimeSort();
        System.out.println("\n==================================");
        insertSort();
        System.out.println("\n==================================");
        selectSort();
    }

    public static void bubbleTimeSort() {
        BubbleSort bubbleSort = new BubbleSort(size);

        for (int i = 0; i < size; i++) {
            bubbleSort.insert((int) (Math.random() * randomNam));
        }

        Date start = new Date();
        bubbleSort.bubbleSort();
        Date end = new Date();

        double second = end.getTime() - start.getTime();
        long millisecond = end.getTime() - start.getTime();

        System.out.println("Bubble sort in millisecond: " + millisecond + " ms");
        System.out.println("Bubble sort in second: " + second / 1000 + " sec");

        bubbleSort.display();
    }

    public static void insertSort() {
        InsertionSort insertionSort = new InsertionSort(size);

        for (int i = 0; i < size; i++) {
            insertionSort.insert((int) (Math.random() * randomNam));
        }

        Date start = new Date();
        insertionSort.insertionSort();
        Date end = new Date();

        double second = end.getTime() - start.getTime();
        long millisecond = end.getTime() - start.getTime();

        System.out.println("Insert sort in millisecond: " + millisecond + " ms");
        System.out.println("Insert sort in second: " + second / 1000 + " sec");

        insertionSort.display();
    }

    public static void selectSort() {
        SelectSort selectSort = new SelectSort(size);

        for (int i = 0; i < size; i++) {
            selectSort.insert((int) (Math.random() * randomNam));
        }

        Date start = new Date();
        selectSort.selectSort();
        Date end = new Date();

        double second = end.getTime() - start.getTime();
        long millisecond = end.getTime() - start.getTime();

        System.out.println("Select sort in millisecond: " + millisecond + " ms");
        System.out.println("Select sort in second: " + second / 1000 + " sec");

        selectSort.display();
    }
}
