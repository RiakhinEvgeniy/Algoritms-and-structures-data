package Analysis_Math_Expression;

public class MathExpression {
    public static void main(String[] args) {
        String input = "3*(4+5)-6/(1+2)", output;
        System.out.println("Enter infix: " + input + "\n");
        InToPost inToPost = new InToPost(input);
        output = inToPost.doTransform();
        System.out.println("Postfix is " + output + '\n');
        //String input = "55+";
        ParsePost parsePost = new ParsePost(output);
        System.out.println(parsePost.doParse());
    }
}
