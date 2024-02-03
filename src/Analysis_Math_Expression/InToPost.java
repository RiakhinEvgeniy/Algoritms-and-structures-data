package Analysis_Math_Expression;

public class InToPost {
    private StackMath stackMath;
    private String input;
    private String output = "";

    public InToPost(String input) {
        this.input = input;
        int size = this.input.length();
        stackMath = new StackMath(size);
    }

    public String doTransform() {
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            stackMath.displayStack("For " + ch + " ");
            switch (ch) {
                case '+':
                case '-':
                    gotOperand(ch, 1);
                    break;
                case '*':
                case '/':
                    gotOperand(ch, 2);
                    break;
                case '(':
                    stackMath.push(ch);
                    break;
                case ')':
                    gotParen();
                    break;
                default:
                    output = output + ch;
                    break;
            }
        }

        while (!stackMath.isEmpty()) {
            stackMath.displayStack("While ");
            output = output + stackMath.pop();
        }
        stackMath.displayStack("End ");
        return output;
    }

    private void gotOperand(char opThis, int priority1) {
        while (!stackMath.isEmpty()) {
            char opTop = stackMath.pop();
            if (opTop == '(') {
                stackMath.push(opTop);
                break;
            }
            else {
                int priority2;
                if (opTop == '+' || opTop == '-')
                    priority2 = 1;
                else
                    priority2 = 2;
                if (priority2 < priority1) {
                    stackMath.push(opTop);
                    break;
                }
                else
                    output = output + opTop;
            }
        }
        stackMath.push(opThis);
    }

    private void gotParen() {
        while (!stackMath.isEmpty()) {
            char chx = stackMath.pop();
            if (chx == '(')
                break;
            else
    output = output + chx;
        }
    }
}
