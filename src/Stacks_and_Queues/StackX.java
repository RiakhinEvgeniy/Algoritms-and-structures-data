package Stack;

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

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
