package Arrays;

public class OrdArray {
    private int[] arr;
    private int nElem;

    public OrdArray(int size) {
        arr = new int[size];
        this.nElem = 0;
    }

    public void merge(int[] arr1, int[] arr2) {
        int i, j;

        for (i = 0; i < 10; i++) {
            arr[i] = arr1[i];
        }

        i = 0;

        for (j = i+1; j < 5; j++) {
            arr[j] = arr2[i];
            i++;
        }

        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    public int[] getArr() {
        return arr;
    }

    public void fillArray(){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            nElem++;
        }
    }

    public void insert(int value) {
        int i = binarySearch(value);
        /*for (i = 0; i < nElem; i++) {
            if (arr[i] > value)
                break;
        }*/

        for (int k = nElem; k > i; k--) {
            arr[k] = arr[k-1];
        }
        arr[i] = value;
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
        int i = binarySearch(value);
        if (i == nElem) return false;
        else {
            for (int j = i; j < nElem-1; j++) {
                arr[j] = arr[j+1];
            }
        }
            nElem--;

        return true;
    }

    public void print() {
        for (int i = 0; i < nElem; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public int sizeArray() {
        return nElem;
    }

    public int binarySearch(int key) {
        int lowerBound = 0;
        int upperBound = nElem - 1;
        int currElem;

        while (true) {
            currElem = (lowerBound + upperBound) / 2;
            if (arr[currElem] == key) return currElem;
            else if (lowerBound > upperBound) return nElem;
            else {
                if (arr[currElem] < key) {
                    lowerBound = currElem + 1;
                } else {
                    upperBound = currElem - 1;
                }
            }
        }
    }
}
