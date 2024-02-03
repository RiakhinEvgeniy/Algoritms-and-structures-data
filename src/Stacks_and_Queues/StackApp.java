package Stack;

public class StackApp {
    public static void main(String[] args) {

        int sizeStack = 10;
        String java = "Java";

        StackX stackX = new StackX(sizeStack);
        for (int i = 0; i < 5; i++) {
            stackX.push(i);
        }

        while (!stackX.isEmpty()) {
            long valueStack = stackX.pop();
            System.out.println(valueStack);
        }
    }
}
