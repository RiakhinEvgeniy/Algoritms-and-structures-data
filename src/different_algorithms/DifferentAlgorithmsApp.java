package different_algorithms;

public class DifferentAlgorithmsApp {

    private final static int KEY = 400;

    public static void main(String[] args) {
        int[][] array = fillArray();

        printArrayWithBrackets(array);
        System.out.println("=====================================");

        printValuesArray(array);
        System.out.println("=====================================");

        printCountRowsAndColumns(array);
        System.out.println("=====================================");

        System.out.println(findByKey(array));
    }

    static int[][] fillArray() {
        return new int[][]{
                {1, 3, 5, 7},
                {8, 11, 16, 17},
                {22, 28, 29, 35},
                {41, 75, 89, 102},
                {123, 124, 189, 400},
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
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
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
            if (array[iRow][jCol] == KEY) {
                return true;
            }

            if (array[iRow][jCol] > KEY) {
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
}
