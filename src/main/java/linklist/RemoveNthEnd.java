package linklist;

public class RemoveNthEnd {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode preNode = new ListNode(-1);
        preNode.next = head;
        ListNode fast = preNode;
        ListNode low = preNode;
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }
        while (fast != null) {
            fast = fast.next;
            low = low.next;
        }
        low.next = low.next.next;
        return head;
    }
}
