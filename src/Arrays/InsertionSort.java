package Arrays;

public class InsertionSort {
    private int[] arr;
    private int nElem;

    public InsertionSort(int size) {
        arr = new int[size];
        nElem = 0;
    }

    public void insert(int value) {
        arr[nElem] = value;
        nElem++;
    }

    public void insertOrder() {
        for (int i = 0; i < nElem; i++) {
            arr[i] = i;
        }
    }

    public void insertRandom() {
        for (int i = 0; i < nElem; i++) {
            arr[i] = (int)(Math.random() * 100);
        }
    }

    public void reverseOrder() {
        int n = 0;
        for (int i = nElem; i > 0; i--) {
            arr[n] = i;
            n++;
        }
    }

    public void display() {
        for (int i = 0; i < nElem; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void insertionSort() {
        int out, in;
        for (out = 1; out < nElem; out++) {
            int tmp = arr[out];
            in = out;
            while (in > 0 && arr[in-1] >= tmp) {
                arr[in] = arr[in-1];
                --in;
            }
            arr[in] = tmp;
        }
    }
}
