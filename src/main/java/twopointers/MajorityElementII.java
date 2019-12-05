/*
229. 求众数 II
中等
给定一个大小为 n 的数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。

说明: 要求算法的时间复杂度为 O(n)，空间复杂度为 O(1)。

示例 1:
输入: [3,2,3]
输出: [3]
示例 2:

输入: [1,1,1,3,3,2,2,2]
输出: [1,2]

 */

package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majorityElement(int[] nums) {
        int major1 = 0, count1 = 0, major2 = 0, count2 = 0;
        for (int num : nums) {
            if (num == major1) {
                count1++;
            } else if (num == major2) {
                count2++;
            } else {
                if (count1 == 0) {
                    major1 = num;
                    count1++;
                } else if (count2 == 0) {
                    major2 = num;
                    count2++;
                } else {
                    count1--;
                    count2--;
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        count1 = 0;
        count2 = 0;
        for (int num : nums) {
            if (num == major1) {
                count1++;
            }
            if (num == major2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            result.add(major1);
        }
        if (count2 > nums.length / 3) {
            result.add(major2);
        }
        return result;
    }
}
