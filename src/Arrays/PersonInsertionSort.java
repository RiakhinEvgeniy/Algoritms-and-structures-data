package Arrays;

public class PersonInsertionSort {
    private Person[] arr;
    private int nElem;

    public PersonInsertionSort(int size) {
        arr = new Person[size];
        nElem = 0;
    }

    public void insert(String lastName, String firstName, int age) {
        arr[nElem] = new Person(lastName, firstName, age);
        nElem++;
    }

    public void display() {
        for (int i = 0; i < nElem; i++) {
            arr[i].displayName();
            System.out.println();
        }
    }

    public void insertionSort() {
        int out, in;
        for (out = 1; out < nElem; out++) {
            Person tmp = arr[out];
            in = out;
            while (in > 0 && arr[in-1].getLastName().compareTo(tmp.getLastName()) > 0) {
                arr[in] = arr[in-1];
                --in;
            }
            arr[in] = tmp;
        }
    }
}
