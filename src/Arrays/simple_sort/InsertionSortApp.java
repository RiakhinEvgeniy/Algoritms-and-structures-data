package Arrays.simple_sort;

public class InsertionSortApp {
    public static void main(String[] args) {
        int size = 20;

        PersonInsertionSort personInsertionSort = new PersonInsertionSort(size);

        personInsertionSort.insert("Nikolaev", "Ivan", 30);
        personInsertionSort.insert("Riakhin", "Yvgenii", 43);
        personInsertionSort.insert("Trocenko", "Alex", 63);
        personInsertionSort.insert("Govtan", "Andrei", 20);
        personInsertionSort.insert("Riakhin", "Vlad", 18);
        personInsertionSort.insert("Avatar", "Alex", 16);

        personInsertionSort.display();
        personInsertionSort.insertionSort();
        System.out.println("====================");
        personInsertionSort.display();
    }
}
