package Long_Sort;

import java.util.Arrays;
import java.util.Date;

public class LongSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 10, 2, 5, 6, 15, 65, 32, 3};

        Date start = new Date();

        while (!isSort(arr)) {
            shuffle(arr);
        }

        Date end = new Date();
        long res = end.getTime() - start.getTime();
        System.out.println(Arrays.toString(arr));
        System.out.println(res);

    }

    static boolean isSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] > arr[i])
                return false;
        }
        return true;
    }

    static void shuffle(int[] arr) {
        int tmp;
        int index;
        for (int i = 0; i < arr.length; i++) {
            index = (int)(Math.random() * arr.length);
            tmp = arr[i];
            arr[i] = arr[index];
            arr[index] = tmp;
        }
    }
}
