package Arrays.simple2_array;

import java.util.Arrays;

public class HighArray {
    private final int[] arr;
    private int nElem;
    private int countSizeArray;

    public HighArray(int size) {
        this.countSizeArray = size;
        arr = new int[size];
        this.nElem = 0;
    }

    public void insert(int value) {
        if (countSizeArray > 0) {
            arr[nElem] = value;
            nElem++;
            countSizeArray--;
        } else {
            throw new ArrayIndexOutOfBoundsException("Array is fill");
        }
    }

    public int getElementAtIndex(int index) {
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index out of bounds");
        }
        return arr[index];
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

    public void remove(int value) {
        int i;
        boolean found = false;
        for (i = 0; i < nElem - 1; i++) {
            if (arr[i] == value) {
                found = true;
                break;
            }
        }
        if (found) {
            for (int j = i; j < nElem - 1; j++) {
                arr[j] = arr[j + 1];
            }
            nElem--;
        }
    }

    public void print() {
        for (int i = 0; i < nElem; i++) {
            System.out.printf("[%d]-%d; ", i, arr[i]);
        }
    }

    public int sizeArray() {
        return arr.length;
    }

    public int getMaxValueInArray() {
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
        if (!(o instanceof HighArray highArray)) return false;

        if (nElem != highArray.nElem) return false;
        return Arrays.equals(arr, highArray.arr);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(arr);
        result = 31 * result + nElem;
        return result;
    }
}
