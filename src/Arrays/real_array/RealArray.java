package Arrays.real_array;

public class RealArray {

    private static final int HEIGHT = 2;
    private static final int LENGTH = 3;

    public static void main(String[] args) {
        Array2D array2D = new Array2D(HEIGHT, LENGTH);
        fillArray(array2D);
        printArray(array2D);
    }

    static void fillArray(Array2D array2D) {
        for (int i = 0, num = 0; i < HEIGHT; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.println("NUM = " + num);
                array2D.setValueFromArray(i, j, num++);
            }
        }
    }

    static void printArray(Array2D array2D) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < LENGTH; j++) {
                System.out.println("[" + i + "]" + "[" + j + "] - " + array2D.getValueFromArray(i, j) + " ");
            }
        }
    }
}
