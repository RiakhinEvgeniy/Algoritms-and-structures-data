package Analysis_Math_Expression;

public class StackInteger {
    private int maxSize;
    private int[] stackArr;
    private int top;

    public StackInteger(int maxSize) {
        this.maxSize = maxSize;
        stackArr = new int[maxSize];
        this.top = -1;
    }

    public void push(int value) {

        if (!isFull()) {
            stackArr[++top] = value;
        } else System.out.println("Stack is filled!!!");
    }

    public int pop() {
        return stackArr[top--];
    }

    public int peek() {
        return stackArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() { return top == maxSize - 1; }

    public int size() { return top + 1; }

    public int peekN(int n) { return stackArr[n]; }

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
