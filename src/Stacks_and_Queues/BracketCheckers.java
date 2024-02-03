package Stack;

public class BracketCheckers {
    private String inputString;

    public BracketCheckers(String inputString) {
        this.inputString = inputString;
    }

    public void check() {
        int stackSize = inputString.length();
        StackChars stackChars = new StackChars(stackSize);

            // (a{b[c]d})
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            switch (ch) {
                case '{':
                case '[':
                case '(':
                    stackChars.push(ch);
                    break;

                case '}':
                case ']':
                case ')':
                    if (!stackChars.isEmpty()) {
                        char ch1 = stackChars.pop();
                        System.out.print(ch1);
                        System.out.print(ch + "\n");
                        if (ch == '}' && ch1 != '{' ||
                            ch == ']' && ch1 != '[' ||
                            ch == ')' && ch1 != '(')
                            System.out.println("Error " + ch + " at " + i);
                    }
                    else
                        System.out.println("Error " + ch + " at " + i);
                    break;

                default:
                    break;
            }
        }
        if (!stackChars.isEmpty()) System.out.println("Missing right delimiter");
    }
}
