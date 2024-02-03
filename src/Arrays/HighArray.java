package Arrays;

import java.util.Arrays;

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
            for (int j = i; j < nElem - 1; j++) {
                arr[j] = arr[j+1];
            } nElem--;
        }
        return true;
    }

    public void print() {
        for (int i = 0; i < nElem; i++) {
            System.out.print(i + "-[" + arr[i] + "];" + " ");
        }
    }

    public int sizeArray() {
        return arr.length;
    }

    public int getMax() {
        int max = arr[0];
        for (int i = 0; i < nElem; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        if (nElem == 0) {
            return -1;
        }

        return max;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HighArray)) return false;

        HighArray highArray = (HighArray) o;

        if (nElem != highArray.nElem) return false;
        return Arrays.equals(arr, highArray.arr);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arr);
        result = 31 * result + nElem;
        return result;
    }

    public int removeGetMax() {
        int max = arr[0];
        for (int i = 0; i < nElem; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        if (nElem == 0) {
            return -1;
        }
        remove(max);

        return max;
    }
}
