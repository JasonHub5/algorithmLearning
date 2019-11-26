package stackandqueue;

import org.junit.Assert;
import org.junit.Test;

import java.util.Stack;

public class CommonTest {
    @Test
    public void stackSortTest(){
        Stack<Integer> stack =  new Stack<Integer>();
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(4);
        Stack<Integer> sort = StackSort.sort(stack);
        System.out.println(sort);
    }

    @Test
    public void ValidParenthesesTest(){
        boolean valid = ValidParentheses.isValid("()[]{}");
        Assert.assertEquals(valid,true);
        boolean valid2 = ValidParentheses.isValid("()[{}");
        Assert.assertEquals(valid2,false);
    }
}
