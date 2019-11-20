/*
53. Maximum Subarray
Easy
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
 */


/*
分治解题思路：
1. 二分数组
2. 找出左边最大和
3. 找出右边最大和
4. 找出包含mid的最大值
5. 输出三者中的最大值
 */
package dc;

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        return subMax(nums, 0, nums.length - 1);
    }

    private static int subMax(int[] nums, int left, int right) {
        if (left >= right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        // 二分左区间最大和
        int maxLeft = 0;
        // 二分右区间最大和
        int maxRight = 0;
        // 包含中间值，向左右延伸子串最大和
        int maxLeftMid = 0;

        maxLeft = subMax(nums, 0, mid - 1);
        maxRight = subMax(nums, mid + 1, right);
        maxLeftMid = midMax(nums, left, right);

        return Math.max(Math.max(maxLeft, maxRight), maxLeftMid);
    }

    private static int midMax(int[] nums, int left, int right) {
        if (left >= right) {
            return nums[left];
        }

        int mid = left + (right - left) / 2;
        int max = nums[mid];
        int preMax = max;
        for (int i = mid - 1; i >= left; i--) {
            preMax += nums[i];
            if (max < preMax) {
                max = preMax;
            }
        }

        int rightMax = nums[mid + 1];
        preMax = rightMax;
        for (int i = mid + 2; i <= right; i++) {
            preMax += nums[i];
            if (rightMax < preMax) {
                rightMax = preMax;
            }
        }

        if (rightMax > 0) {
            max += rightMax;
        }
        return max;
    }
}
