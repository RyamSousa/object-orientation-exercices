package main.question47;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // String balanceada
        String str1 = "(())()(())()";
        // String não balanceada
        String str2 = "((())()()(())()";

        Stack<String> stack = new Stack<>();

        isBalanced(stack, str1);
        stack.empty();
        isBalanced(stack, str2);
    }

    private static void isBalanced(Stack<String> stack, String text) {
        boolean checkIsEmpty = true;

        for (int i = 0; i < text.length() && checkIsEmpty; i++) {
            String character = String.valueOf(text.charAt(i));

            if (character.equals("(")) {
                stack.push(character);
            } else {
                if (stack.isEmpty()) checkIsEmpty = false;
                else stack.pop();
            }
        }

        if (checkIsEmpty && stack.isEmpty()) {
            System.out.println("A pilha está balaceada");
        } else {
            System.out.println("A pilha não está balaceada");
        }
    }
}
