package Arrays;

public class HighArrayApp {
    public static void main(String[] args) {

        int sizeArray = 10;
        int key = 9;

        HighArray highArray = createAndInitArray(sizeArray);

        highArray.print();
        System.out.println("\nSize of array is: " + highArray.sizeArray());

        findByKey(highArray, key);

        System.out.println("Max element: " + highArray.getMaxValueInArray());

        if (checkedElementByKey(highArray, key)) {
            highArray.remove(key);
            System.out.println("Array after removal: ");
            highArray.print();
        } else {
            System.out.println("Key does not exist in this array: ");
            highArray.print();
        }

        System.out.println("\nReal size of array is: " + highArray.sizeArray());
    }

    protected static HighArray createAndInitArray(int sizeArray) {
        HighArray highArray = new HighArray(sizeArray);

        for (int i = 0; i < sizeArray; i++) {
            int value = (int) (Math.random() * 15);
            highArray.insert(value);
        }
        return highArray;
    }

    protected static void findByKey(HighArray highArray, int key) {
        if (highArray.find(key)) {
            System.out.println("Found element: " + key);
        } else {
            System.out.println("Not found element: " + key);
        }
    }

    private static boolean checkedElementByKey(HighArray highArray, int key) {
        return highArray.find(key);
    }
}
