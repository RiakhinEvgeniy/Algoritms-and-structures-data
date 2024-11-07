package Arrays.select_sort;

public class SelectSort {
    private final int[] arr;
    private int nElem;

    public SelectSort(int size) {
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

    public void selectSort() {
        int out, in, min;
        for (out = 0; out < nElem; out++) {
            min = out;
            for (in = out+1; in < nElem; in++) {
                if (arr[in] < arr[min]) {
                    min = in;
                }
            }
            swap(out, min);
        }
    }

    private void swap(int out, int min) {
        int tmp = arr[out];
        arr[out] = arr[min];
        arr[min] = tmp;
    }
}
