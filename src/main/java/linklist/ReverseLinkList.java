package linklist;

public class ReverseLinkList {
    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode result = null;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = result;
            result = current;
            current = next;
        }
        return result;
    }
}
