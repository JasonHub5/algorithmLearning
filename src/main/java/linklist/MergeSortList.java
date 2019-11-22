package linklist;

public class MergeSortList {
    public static ListNode sort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode midNode = FindMidNode.findMidNode(head);
        ListNode rightNode = midNode.next;
        midNode.next = null;

        return merge(sort(head), sort(rightNode));
    }

    private static ListNode merge(ListNode leftNode, ListNode rightNode) {
        if (leftNode == null) {
            return rightNode;
        }
        if (rightNode == null) {
            return leftNode;
        }

        if (leftNode.val < rightNode.val) {
            leftNode.next = merge(leftNode.next, rightNode);
            return leftNode;
        } else {
            rightNode.next = merge(leftNode, rightNode.next);
            return rightNode;
        }
    }
}
