package linklist;

public class MergeTwoList {

    /**
     * 复杂写法
     *
     * @param node1
     * @param node2
     * @return
     */
    public static ListNode merge(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        ListNode dummy1 = new ListNode(0);
        dummy1.next = node1;
        ListNode dummy2 = new ListNode(0);
        dummy2.next = node2;

        ListNode result = node1.val < node2.val ? node1 : node2;

        ListNode current1 = dummy1.next;
        ListNode next1 = current1;
        ListNode current2 = dummy2.next;
        ListNode next2 = current2;
        while (current1 != null && current2 != null) {
            if (current1.val < current2.val) {
                next1 = current1.next;
                current1.next = current2;
                current1 = next1;
            } else if (current1.val > current2.val) {
                next2 = current2.next;
                current2.next = current1;
                current2 = next2;
            } else {
                next1 = current1.next;
                next2 = current2.next;
                current1.next = current2;
                current1 = next1;
                current2 = next2;
            }
        }
        return result;
    }

    /**
     * 简洁写法
     *
     * @param node1
     * @param node2
     * @return
     */
    public static ListNode merge2(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }
        if (node1 != null) {
            current.next = node1;
        }
        if (node2 != null) {
            current.next = node2;
        }
        return dummy.next;
    }

    /**
     * 递归写法
     *
     * @param node1
     * @param node2
     * @return
     */
    public static ListNode merge3(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }

        if (node1.val < node2.val) {
            node1.next = merge3(node1.next, node2);
            return node1;
        } else {
            node2.next = merge3(node1, node2.next);
            return node2;
        }
    }
}
