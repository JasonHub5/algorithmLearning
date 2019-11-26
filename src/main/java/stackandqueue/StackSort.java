package stackandqueue;

import java.util.Stack;

public class StackSort {
    public static Stack<Integer> sort(Stack<Integer> stack) {
        Stack<Integer> newStack = new Stack<>();
        while (!stack.isEmpty()) {
            int num = stack.pop();
            while (!newStack.isEmpty() && newStack.peek() > num) {
                stack.push(newStack.pop());
            }
            newStack.push(num);
        }
        return newStack;
    }
}
