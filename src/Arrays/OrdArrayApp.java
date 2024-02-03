package Arrays;

public class OrdArrayApp {
    public static void main(String[] args) {
        int sizeArray = 20;
        int key = 9;

        OrdArray ordArray1 = new OrdArray(sizeArray);
        for (int i = 0; i < 10; i++) {
            ordArray1.insert(i);
        }

        OrdArray ordArray2 = new OrdArray(sizeArray);
        for (int i = 0; i < 5; i++) {
            ordArray2.insert(i);
        }

        OrdArray ordArray3 = new OrdArray(ordArray1.sizeArray() + ordArray2.sizeArray());
        ordArray3.merge(ordArray1.getArr(), ordArray2.getArr());

        /*System.out.println();
        ordArray1.print();
        System.out.println();
        ordArray2.print();*/
        /*ordArray.remove(key);
        System.out.println();
        ordArray.print();*/
    }
}
