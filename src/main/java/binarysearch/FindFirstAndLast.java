/*
34. Find First and Last Position of Element in Sorted Array
Medium

Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

 */

package binarysearch;

public class FindFirstAndLast {
    public static int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length <= 0) {
            return new int[]{-1, -1};
        }

        return new int[]{findFirst(nums, target), findLast(nums, target)};
    }

    /**
     * 找出第一个target
     *
     * @param nums
     * @param target
     * @return
     */
    public static int findFirst(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                right = mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[left] == target) {
            return left;
        }
        if (nums[right] == target) {
            return right;
        }
        return -1;
    }

    /**
     * 找出最后一个target
     *
     * @param nums
     * @param target
     * @return
     */
    public static int findLast(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left + 1 < right) {
            int mid = left + ((right - left) >> 1);
            if (nums[mid] == target) {
                left = mid;
            } else if (nums[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }

        if (nums[right] == target) {
            return right;
        }
        if (nums[left] == target) {
            return left;
        }
        return -1;
    }
}
