package Stacks_and_Queues;

public class StackChars {
    private int maxSize;
    private char[] stackChar;
    private int top;

    public StackChars(int maxSize) {
        this.maxSize = maxSize;
        stackChar = new char[maxSize];
        this.top = -1;
    }

    public void push(char value) {

        if (!isFull()) {
            stackChar[++top] = value;
        } else System.out.println("Stack is filled!!!");
    }

    public char pop() {
        return stackChar[top--];
    }

    public long peek() {
        return stackChar[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }
}
