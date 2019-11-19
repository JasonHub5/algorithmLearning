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

package dc;

public class FindKthElement {
    public static int findKthLargest(int[] nums, int k) {
        if (nums == null || nums.length < k) {
            return -1;
        }
        return findKth(nums, 0, nums.length - 1, k);
    }

    public static int findKth(int[] nums, int left, int right, int k) {
        int pivot = nums[left];
        int i = left + 1;
        int j = right;
        while (i < j) {
            while (i < j && nums[j] > pivot) {
                j--;
            }
            while (i < j && nums[i] < pivot) {
                i++;
            }

            if (i >= j) {
                break;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = nums[i];
        }

        nums[left] = nums[j];
        nums[j] = pivot;

        if (j == k) {
            return nums[pivot];
        } else if (j > k) {
            return findKth(nums, left, j - 1, k);
        } else {
            return findKth(nums, j + 1, right, k);
        }
    }
}
