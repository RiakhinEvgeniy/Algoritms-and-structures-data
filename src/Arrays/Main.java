package Arrays;

public class Main {
    public static void main(String[] args) {

        int sizeArray = 20;
        int key = 5;

        HighArray highArray = new HighArray(sizeArray);
        for (int i = 0; i < 10; i++) {
            highArray.insert(i);
        }

        highArray.print();
        if (highArray.find(key)) {
            System.out.println("\nKey = " + key + " find!");
        }
        else System.out.println("\nKey = " + key + " not find.");

        boolean removed = highArray.remove(key);
        if (removed) {
            System.out.println("Element = " + key + " removed!");
        }
        highArray.print();
        System.out.println("\nSize of array = " + highArray.sizeArray());
    }
}
