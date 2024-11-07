package Arrays.bubble_sort;

public class BubbleSort {
    private final int[] arr;
    private int nElem;

    public BubbleSort(int size) {
        arr = new int[size];
        nElem = 0;
    }

    public void insert(int value) {
        arr[nElem] = value;
        nElem++;
    }

    public void insertOrder(int value) {
        arr[nElem] = value;
        nElem++;
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

    public void bubbleSort() {
        int out, in;
        for (out = nElem - 1; out > 1; out--) {
            for (in = 0; in < out; in++) {
                if (arr[in] > arr[in+1]) {
                    swap(in, in+1);
                }
            }
        }
    }

    private void swap(int a, int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }
}
