package Stacks_and_Queues;

public class StackCharsApp {
    public static void main(String[] args) {
        String input = "([a{b[c]d}])";
        BracketCheckers bracketCheckers = new BracketCheckers(input);
        bracketCheckers.check();
    }
}
