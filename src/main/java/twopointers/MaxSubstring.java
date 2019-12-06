/*
连续子串的最大值
在一个有N个正整数的数组中，找出一个连续子数组，使得连续子数组中元素之和尽可能大，但不能大于M

[4, 7, 12, 1, 2, 3, 6]  17
[2, 4]
 */

package twopointers;

public class MaxSubstring {

    public static int[] maxSubstring(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int low = 0, high = 0;
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        int sum = 0;
        while (low < nums.length) {
            while (high < nums.length) {
                sum += nums[high];
                if (sum <= target) {
                    if (max < sum) {
                        max = sum;
                        result[0] = low;
                        result[1] = high;
                    }
                    high++;
                } else {
                    sum -= nums[high];
                    break;
                }
            }
            sum = sum - nums[low];
            low++;
        }
        return result;
    }

    /**
     * 单个while循环的写法
     * @param nums
     * @param target
     * @return
     */
    public static int[] maxSubstring2(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        int low = 0, high = 0;
        int max = Integer.MIN_VALUE;
        int[] result = new int[2];
        int sum = 0;
        while (high < nums.length) {
            if (low == high) {
                sum = nums[high];
            } else if (low > high) {
                high++;
                continue;
            } else {
                sum += nums[high];
            }

            if (sum <= target) {
                if (max < sum) {
                    max = sum;
                    result[0] = low;
                    result[1] = high;
                }
                high++;
            } else {
                if (low == high) {
                    sum -= nums[high];
                } else {
                    sum -= nums[high];
                    sum = sum - nums[low];
                }
                low++;
            }
        }
        return result;
    }
}
