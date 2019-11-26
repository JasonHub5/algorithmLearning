package stackandqueue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueues {
    /**
     * Initialize your data structure here.
     */
    Queue<Integer> queue;

    public StackUsingQueues() {
        this.queue = new LinkedList<Integer>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        this.queue.add(x);
        for (int i = 0; i < queue.size(); i++) {
            this.queue.add(this.queue.poll());
        }
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        return this.queue.poll();
    }

    /**
     * Get the top element.
     */
    public int top() {
        return this.queue.peek();
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return this.queue.isEmpty();
    }
}
