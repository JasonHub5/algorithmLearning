/*
147. Insertion Sort List(https://leetcode.com/problems/insertion-sort-list/)
Algorithm of Insertion Sort:

Insertion sort iterates, consuming one input element each repetition, and growing a sorted output list.
At each iteration, insertion sort removes one element from the input data, finds the location it belongs within the sorted list, and inserts it there.
It repeats until no input elements remain.

Example 1:

Input: 4->2->1->3
Output: 1->2->3->4
Example 2:

Input: -1->5->3->4->0
Output: -1->0->3->4->5
 */

package linklist;

import java.util.zip.CRC32;

public class InsertionSortList {
    public static ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        //dummy.next = head;
        ListNode preNode = dummy;
        ListNode current = head;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            while (preNode.next != null && preNode.next.val < current.val) {
                preNode = preNode.next;
            }

            current.next = preNode.next;
            preNode.next = current;
            current = next;
            preNode = dummy;
        }
        return dummy.next;
    }
}
