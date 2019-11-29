/*
23. Merge k Sorted Lists
Hard
Merge k sorted linked lists and return it as one sorted list. Analyze and describe its complexity.

Example:

Input:
[
  1->4->5,
  1->3->4,
  2->6
]
Output: 1->1->2->3->4->4->5->6

解题思路：
解法一：分治，每次对两个链表merge
解法二：最小堆，堆的开始存入每个链表的第一个节点，接下来每次堆顶出堆，然后把该元素对应的链表的下一个节点入堆

 */

package heap;

import linklist.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MergeArrary {

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) {
            return null;
        }
        if (lists.length == 1) {
            return lists[0];
        }

        PriorityQueue<ListNode> heap = new PriorityQueue<>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });

        for (int i = 0; i < lists.length; i++) {
            heap.add(lists[i]);
        }
        ListNode pre = new ListNode(0);
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            if (node.next != null) {
                heap.add(node.next);
            }
            pre.next = node;
        }
        return pre.next;
    }
}
