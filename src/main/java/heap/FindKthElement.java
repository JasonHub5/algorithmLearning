/*
215. Kth Largest Element in an Array
Medium
Find the kth largest element in an unsorted array. Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:

Input: [3,2,1,5,6,4] and k = 2
Output: 5
Example 2:

Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4
Note:
You may assume k is always valid, 1 ≤ k ≤ array's length.

 */

package heap;

import heap.base.MaxHeap;

import java.util.PriorityQueue;

public class FindKthElement {
    /*
    思路：
    维护一个最小堆，先插入数组前k个值，数组剩下的值，如果比堆顶大，就入堆，最后返回堆顶
     */
    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return -1;
        }
        return findKth1(nums, k);
    }

    /**
     * 用我自己的 最大堆 实现
     *
     * @param nums
     * @param k
     * @return
     */
    private static int findKth1(int[] nums, int k) {
        MaxHeap heap = new MaxHeap();
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                heap.add(-nums[i]);
                continue;
            }
            if (-heap.peek() < nums[i]) {
                heap.add(-nums[i]);
                heap.pop();
            }
        }
        return -heap.peek();
    }

    /**
     * 用java 的priorityQueue实现
     *
     * @param nums
     * @param k
     * @return
     */
    private static int findKth2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                heap.add(nums[i]);
            }
            if (heap.peek() < nums[i]) {
                heap.add(nums[i]);
                heap.poll();
            }
        }
        return heap.peek();
    }
}
