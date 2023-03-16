package Arrays;

public class HighArray {
    private int[] arr;
    private int nElem;

    public HighArray(int size) {
        arr = new int[size];
        this.nElem = 0;
    }

    public void insert(int value) {
        arr[nElem] = value;
        nElem++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElem; i++) {
            if (arr[i] == key) {
                return true;
            }
        }
        return false;
    }

    public boolean remove(int value) {
        int i;
        for (i = 0; i < nElem -1; i++) {
            if (arr[i] == value) break;
        }
        if (i == nElem) return false;
        else {
            for (int j = i; j < nElem; j++) {
                arr[j] = arr[j+1];
            } nElem--;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < nElem; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int sizeArray() {
        return arr.length;
    }
}
