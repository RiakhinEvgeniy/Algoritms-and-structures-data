package Arrays.simple_array;

public class SimpleArray {

    static int nElem = 0;

    public static void main(String[] args) {
        int sizeArr = 10;
        int key = 2;
        int[] arrayInit = createAndInitArray(sizeArr);
        displayArray(arrayInit);
        findKey(arrayInit, key);
        removeKey(arrayInit, key);
        displayArray(arrayInit);
        System.out.println("Real size of array: " + arrayInit.length);
    }

    protected static int[] createAndInitArray(int sizeArr) {
        nElem = sizeArr;
        int[] arr = new int[sizeArr];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 20);
        }
        return arr;
    }

    protected static void displayArray(int[] arr) {
        for (int i = 0; i < nElem; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nLength of array is: " + nElem + " elements.");
    }

    protected static void findKey(int[] arr, int key) {
        boolean found = false;
        for (int j : arr) {
            if (j == key) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("\nKey: " + key + " found!");
        } else {
            System.out.println("\nKey: " + key + " not found!");
        }
    }

    protected static void removeKey(int[] arr, int key) {
        int index;
        boolean found = false;
        for (index = 0; index < nElem; index++) {
            if (arr[index] == key) {
                found = true;
                break;
            }
        }

        if (found) {
            for (int i = index; i < nElem - 1; i++) {
                arr[i] = arr[i + 1];
            }
            nElem--;
        }
    }
}
