/*
160. Intersection of Two Linked Lists(https://leetcode.com/problems/intersection-of-two-linked-lists/)
Easy
Write a program to find the node at which the intersection of two singly linked lists begins.

For example, the following two linked lists:
Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,0,1,8,4,5], skipA = 2, skipB = 3
Output: Reference of the node with value = 8
Input Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect). From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,0,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.

 */

package linklist;

public class IntersectionNode {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode currentA = headA;
        ListNode currentB = headB;
        while (currentA != currentB) {
            currentA = currentA.next == null ? headA : currentA.next;
            currentB = currentB.next == null ? headB : currentB.next;
        }
        return currentA;
    }
}
