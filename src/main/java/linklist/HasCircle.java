/*
判断链表是否有环
思路：
用两个指针，一个快，一个慢，如果相遇，则有环
 */

package linklist;

public class HasCircle {
    public static boolean hasCircle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }
}
