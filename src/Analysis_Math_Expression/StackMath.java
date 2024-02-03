package Analysis_Math_Expression;

public class StackMath {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackMath(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char c) {
        stackArray[++top] = c;
    }

    public char pop() {
        return stackArray[top--];
    }

    public char peek() {
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int size() {
        return top + 1;
    }

    public char peekN(int n) {
        return stackArray[n];
    }

    public void displayStack(String string) {
        System.out.print(string);
        System.out.print("Stack (bottom-->top): ");
        for (int i = 0; i < size(); i++) {
            System.out.print(peekN(i));
            System.out.print(' ');
        }
        System.out.println("");
    }
}
