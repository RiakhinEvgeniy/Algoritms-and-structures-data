package Stacks_and_Queues;

public class StackX {
    private int maxSize;
    private int[] stackArr;
    private int top;

    public StackX(int maxSize) {
        this.maxSize = maxSize;
        stackArr = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {

        if (!isFull()) {
            stackArr[++top] = value;
        } else System.out.println("Stack is filled!!!");
    }

    public long pop() {
        return stackArr[top--];
    }

    public long peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() { return top == maxSize - 1; }

    public int size() { return top + 1; }

    public long peekN(int n) { return stackArr[n]; }

    public void displayStack(String str) {
        System.out.print(str);
        System.out.print("Stack (bottom-->top: ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
