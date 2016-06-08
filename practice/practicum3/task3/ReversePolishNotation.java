package practice.practicum3.task3;

import java.util.ArrayDeque;

public class ReversePolishNotation {
    public int evaluate(String expression) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        String[] elements = expression.split(" ");
        for (String element : elements) {
            int i;
            try {
                i = Integer.parseInt(element);
                stack.push(i);
            }catch (NumberFormatException e){
                if (element.equals("+")) {
                    i = stack.pop() + stack.pop();
                    stack.push(i);
                }
                if (element.equals("-")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    i = b - a;
                    stack.push(i);
                }
                if (element.equals("*")) {
                    i = stack.pop() * stack.pop();
                    stack.push(i);
                }
                if (element.equals("/")) {
                    int a = stack.pop();
                    int b = stack.pop();
                    i = b / a;
                    stack.push(i);
                }
            }

        }
        return stack.pop();
    }
}
