package linklist;

public class BeginningOfLoop {
    public static ListNode findBeginningOfLoop(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                fast = head;
                break;
            }
        }

        while (slow == fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
