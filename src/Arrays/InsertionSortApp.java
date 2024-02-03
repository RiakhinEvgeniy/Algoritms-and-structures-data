package Arrays;

import com.sun.xml.internal.ws.spi.db.DatabindingException;

import java.util.Date;

public class InsertionSortApp {
    public static void main(String[] args) {
        int size = 20;
        /*InsertionSort insertionSort = new InsertionSort(size);
        for (int i = 0; i < size; i++) {
            insertionSort.insert((int)(Math.random() * 100));
        }
        //insertionSort.display();
        Date start = new Date();
        insertionSort.insertionSort();
        Date end = new Date();
        long res = end.getTime() - start.getTime();
        //System.out.println();
        //insertionSort.display();
        System.out.println("\n" + res);*/
        PersonInsertionSort personInsertionSort = new PersonInsertionSort(size);

        personInsertionSort.insert("Nikolaev", "Ivan", 30);
        personInsertionSort.insert("Riakhin", "Yvgenii", 43);
        personInsertionSort.insert("Trocenko", "Alex", 63);
        personInsertionSort.insert("Govtan", "Andrei", 20);
        personInsertionSort.insert("Riakhin", "Vlad", 18);

        personInsertionSort.display();
        personInsertionSort.insertionSort();
        System.out.println();
        personInsertionSort.display();
    }
}
