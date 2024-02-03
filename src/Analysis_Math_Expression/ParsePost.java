package Analysis_Math_Expression;

public class ParsePost {
    private StackInteger stackInteger;
    private String input;

    public ParsePost(String input) {
        this.input = input;
    }

    public int doParse() {
        stackInteger= new StackInteger(20);
        char charExpression;
        int number1, number2, result;

        for (int i = 0; i < input.length(); i++) {
            charExpression = input.charAt(i);
            stackInteger.displayStack("" + charExpression + " ");
            if (charExpression >= '0' && charExpression <= '9') {
                stackInteger.push(charExpression - '0');
            } else {
                number2 = stackInteger.pop();
                number1 = stackInteger.pop();

            switch (charExpression) {
                case '+':
                    result = number1 + number2;
                    break;
                case '-':
                    result = number1 - number2;
                    break;
                case '*':
                    result = number1 * number2;
                    break;
                case '/':
                    result = number1 / number2;
                    break;
                default:
                    result = 0;
            }
            stackInteger.push(result);
            }
        }
        result = stackInteger.pop();
        return result;
    }
}
