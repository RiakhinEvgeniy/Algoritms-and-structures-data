package Stacks_and_Queues;

public class PriorityQueue {
    private int maxSize;
    private int[] quePriority;
    private int nElem;

    public PriorityQueue(int maxSize) {
        this.maxSize = maxSize;
        quePriority = new int[maxSize];
        nElem = 0;
    }

    public void insert(int value) {
        int j;
        if (nElem == 0)
            quePriority[nElem++] = value;
        else {
            for (j = nElem - 1; j >= 0; j--) {
                if (value > quePriority[j])
                    quePriority[j+1] = quePriority[j];
                else
                    break;
            }
            quePriority[j+1] = value;
            nElem++;
        }
    }

    public int remove() {
        return quePriority[--nElem];
    }

    public int peekMin() {
        return quePriority[nElem-1];
    }

    public boolean isEmpty() {
        return (nElem == 0);
    }

    public boolean isFull() {
        return (nElem == maxSize);
    }


}
