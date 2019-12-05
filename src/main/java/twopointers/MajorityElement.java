/*
169. 多数元素
给定一个大小为 n 的数组，找到其中的多数元素。多数元素是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。

你可以假设数组是非空的，并且给定的数组总是存在多数元素。

示例 1:
输入: [3,2,3]
输出: 3

示例 2:
输入: [2,2,1,1,1,2,2]
输出: 2

 */
package twopointers;

public class MajorityElement {
    /*
    这题并不是双指针
    解法一：
        排序，然后中间节点一定是要找的元素  O(nlgn)
    解法二：
       同归于尽法，见以下代码
     */

    public static int majorityElement(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int major = nums[0];
        int majorCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == major) {
                majorCount++;
            } else if (majorCount > 0) {
                majorCount--;
            } else {
                major = nums[i];
                majorCount = 1;
            }
        }
        return major;
    }
}
