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
        RemoveNthEnd.removeNthFromEnd(node, 2);
        node.print();
    }

    /**
     * 测试：查找之间节点
     */
    @Test
    public void findMidNodeTest() {
        ListNode node = new ListNode(5);
        node.next = new ListNode(4);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(2);
//        node.next.next.next.next = new ListNode(1);

        ListNode midNode = FindMidNode.findMidNode(node);
        Assert.assertEquals(midNode.val, 5);
    }

    /**
     * 测试：是否有环
     */
    @Test
    public void hasCircleTest() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ListNode loopNode = new ListNode(3);
        node.next.next = loopNode;
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = loopNode;

        boolean hasCircle = HasCircle.hasCircle(node);
        Assert.assertEquals(hasCircle, true);
    }

    /**
     * 测试：查找环的开始点
     */
    @Test
    public void beginningOfLoopTest() {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        ListNode loopNode = new ListNode(3);
        node.next.next = loopNode;
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = loopNode;

        ListNode start = BeginningOfLoop.findBeginningOfLoop(node);
        Assert.assertEquals(start.val, 3);
    }

    /**
     * 测试：合并链表
     */
    @Test
    public void mergeTwoLinkTest() {
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(7);
        node1.next.next.next = new ListNode(9);

        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(3);
        node2.next.next = new ListNode(5);
        node2.next.next.next = new ListNode(8);

        ListNode newNode = MergeTwoList.merge2(node1, node2);
        newNode.print();
    }

    @Test
    public void insertionSortListTest(){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);
        node1.next.next.next = new ListNode(8);
        node1.next.next.next.next = new ListNode(2);
        ListNode newNode = InsertionSortList.insertionSortList(node1);
        newNode.print();
    }

    @Test
    public void mergeSortList(){
        ListNode node1 = new ListNode(1);
        node1.next = new ListNode(3);
        node1.next.next = new ListNode(5);
        node1.next.next.next = new ListNode(8);
        node1.next.next.next.next = new ListNode(2);
        ListNode newNode = MergeSortList.sort(node1);
        newNode.print();
    }

    @Test
    public void reverseLinkList(){
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        ListNode newNode = ReverseLinkList.reverse(node);
        newNode.print();
    }
}
