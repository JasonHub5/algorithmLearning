package linklist;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

public class LinkListTest {

    @Test
    public void test() {
        MyLinkList<Integer> list = new MyLinkList<>();
        list.addFirst(1);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.printList();

        Integer value = list.findByIndex(1);
        Assert.assertEquals(value.intValue(), 1);

        Integer midNode = list.findMidNode();
        Assert.assertEquals(midNode.intValue(), 2);

        list.deleteLast();
        list.printList();

        list.deleteFirst();
        list.printList();
    }

    @Test
    public void RemoveNthEndTest() {
        ListNode node = new ListNode(5);
        node.next = new ListNode(4);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(2);
        node.next.next.next.next = new ListNode(1);
        node.print();
        RemoveNthEnd.removeNthFromEnd(node,2);
        node.print();
    }
}
