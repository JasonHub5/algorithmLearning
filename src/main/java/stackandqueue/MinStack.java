package stackandqueue;

import java.util.Stack;


/*
本题主要是要解决当一个值为最小值，且出现多次时，在pop时该怎么做
我的思路：单独开个hashmap存储每个元素的次数，当元素push和pop时，要更新其后面的次数
LC上的思路：当push时发现当前元素为min，则把旧的min先入栈，然后再入栈新的min，当pop时发现当前元素为最小值时，把旧min设置为最小值
 */

public class MinStack {
    Stack<Integer> stack;
    int min;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if (min >= x) {
            stack.push(min);
        }
        stack.push(x);
    }

    public void pop() {
        if (stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
