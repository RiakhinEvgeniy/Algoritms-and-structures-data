package Arrays.simple_sort;

public class ArrayDataPerson {
    private final Person[] arrPer;
    private int nElem;

    public ArrayDataPerson(int sizeArray) {
        this.arrPer = new Person[sizeArray];
        nElem = 0;
    }

    public void insert(String firstName, String lastName, int age) {
        arrPer[nElem] = new Person(firstName, lastName, age);
        nElem++;
    }

    public Person find(String searchName) {
        int j;
        for (j = 0; j < nElem; j++) {
            if (arrPer[j].getLastName().equals(searchName)) {
                break;
            }
        }
        if (j == nElem)
            return null;

        else
            return arrPer[j];
    }

    public boolean delete(String searchName) {
        int j;
        for (j = 0; j < nElem; j++) {
            if (arrPer[j].getLastName().equals(searchName)) {
                break;
            }
        }
        if (j == nElem) {
            return false;
        }
        else {
            for (int k = j; k < nElem; k++) {
                arrPer[k] = arrPer[k+1];
                nElem--;
            }
            return true;
        }
    }

    public void print() {
        for (int i = 0; i < nElem; i++) {
            arrPer[i].displayPerson();
        }
    }
}
