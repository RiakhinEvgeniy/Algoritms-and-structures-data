package Stacks_and_Queues;

public class MyQueue {
    private int maxSize;
    private int[] queueArr;
    private int front;
    private int rear;
    private int nItem;

    public MyQueue(int size) {
        maxSize = size;
        queueArr = new int[maxSize];
        front = 0;
        rear = -1;
        nItem = 0;
    }

    public void insert(int value) {
        if (rear == maxSize - 1)
            rear = -1;
        queueArr[++rear] = value;
        nItem++;
    }

    public int remove() {
        int tmp = 0;
            if (!isEmpty()) {
                tmp = queueArr[front++];
                if (front == maxSize)
                    front = 0;
                nItem--;
            }
            else System.out.println("Queue is empty!");
        return tmp;
    }

    public int peekFront() {
        return queueArr[front];
    }
    
    public int peekRear() { return queueArr[rear]; }

    public boolean isEmpty() {
        return (nItem == 0);
    }

    public boolean isFull() {
        return (nItem == maxSize);
    }

    public int size() {
        return nItem;
    }
}
