package different_algorithms;

public class DifferentAlgorithmsApp {

    private final static int KEY_FOR_FIND_VALUE = 41;

    public static void main(String[] args) {
        int[][] array = fillArray();

        printArrayWithBrackets(array);
        System.out.println("=====================================\n");

        printOrderRunning(array);
        System.out.println("=====================================\n");

        printValuesArray(array);
        System.out.println("=====================================\n");

        printCountRowsAndColumns(array);
        System.out.println("=====================================\n");

        System.out.println(findByKey(array));
    }

    static int[][] fillArray() {
        return new int[][]{
                {1, 3, 5, 7, 8, 11, 13, 16, 20},
                {2, 5, 6, 8, 9, 12, 14, 17, 22},
                {3, 6, 7, 9, 10, 13, 17, 19, 24},
                {27, 75, 89, 102, 105, 123, 127, 135, 140},
                {41, 200, 205, 207, 230, 235, 241, 242, 253},
        };
    }

    static void printArrayWithBrackets(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("array[%d][%d] = %d; ", i, j, array[i][j]);
            }
            System.out.println();
        }
    }

    static void printValuesArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    static boolean findByKey(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return false;
        }
        int row = array.length;
        int col = array[0].length;
        int iRow = 0;
        int jCol = col - 1;
        System.out.printf("row: %d, col: %d\n", row, col);
        while (iRow < row && jCol >= 0) {
            if (array[iRow][jCol] == KEY_FOR_FIND_VALUE) {
                return true;
            }

            if (array[iRow][jCol] > KEY_FOR_FIND_VALUE) {
                jCol--;
            } else {
                iRow++;
            }
        }
        return false;
    }

    static void printCountRowsAndColumns(int[][] array) {
        System.out.println("Rows = " + array.length);
        System.out.println("Columns = " + array[0].length);
    }

    static void printOrderRunning(int[][] array) {
        if (array == null || array.length == 0 || array[0].length == 0) {
            return;
        }
        int row = array.length;
        int col = array[0].length;
        int iRow = 0;
        int jCol = col - 1;
        System.out.printf("row: %d, col: %d\n", row, col);
        while (iRow < row && jCol >= 0) {
            if (array[iRow][jCol] == KEY_FOR_FIND_VALUE) {
                System.out.printf("array[iRow][jCol] == KEY -> array[%d][%d] = %d = %d; \n", iRow, jCol, array[iRow][jCol], KEY_FOR_FIND_VALUE);
                return;
            }

            if (array[iRow][jCol] > KEY_FOR_FIND_VALUE) {
                System.out.printf("array[iRow][jCol] > KEY -> array[%d][%d] = %d > %d; \n", iRow, jCol, array[iRow][jCol], KEY_FOR_FIND_VALUE);
                jCol--;
            } else {
                System.out.printf("array[iRow][jCol] < KEY -> array[%d][%d] = %d < %d; \n", iRow, jCol, array[iRow][jCol], KEY_FOR_FIND_VALUE);
                iRow++;
            }
        }
    }
}
