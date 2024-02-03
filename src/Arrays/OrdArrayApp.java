package Arrays;

public class Main {
    public static void main(String[] args) {
        int sizeArray = 10;
        int key = 9;

        /*HighArray highArray = new HighArray(sizeArray);

        for (int i = 0; i < sizeArray; i++) {
            int val = (int)(Math.random() * 100);
            highArray.insert(val);
        }

        highArray.print();
        System.out.println();
        System.out.println("Max element " + highArray.getMax());
        //System.out.println("Max remove element " + highArray.removeGetMax());
        System.out.print("Array without removed element: ");
        highArray.print();

        HighArray highArray1 = new HighArray(sizeArray);

        for (int i = 0; i < sizeArray; i++) {
            int max = highArray.removeGetMax();
            highArray1.insert(max);
        }
        System.out.print("\nSorted array: ");
        highArray1.print();*/

        OrdArray ordArray = new OrdArray(sizeArray);
        for (int i = 0; i < sizeArray; i++) {
            ordArray.insert(i);
        }
        ordArray.print();
        ordArray.remove(key);
        System.out.println();
        ordArray.print();
    }
}
