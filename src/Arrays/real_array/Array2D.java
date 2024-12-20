package Arrays.real_array;

public class Array2D {
    private int[] array;
    private final int height;

    public Array2D(int height, int length) {
        this.array = new int[height * length];
        this.height = height;
    }

    public int getValueFromArray(int row, int col) {
        return array[row * height + col];
    }

    public void setValueFromArray(int row, int col, int value) {
        array[row * height + col] = value;
    }
}
