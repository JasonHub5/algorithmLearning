package linklist;

public class ReverseLinkListII {
    public static ListNode reverse(ListNode head, int start, int end) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode pre = head;
        for (int i = 0; i < start - 2; i++) {
            pre = pre.next;
        }

        ListNode current = pre.next;
        ListNode reversPre = null;
        ListNode temp = current;
        ListNode next = null;
        for (int i = 0; i < end - start + 1; i++) {
            next = current.next;
            current.next = reversPre;
            reversPre = current;
            current = next;
        }
        pre.next = reversPre;
        temp.next = next;

        return head;
    }
}
