/*
18. 4Sum
Given an array nums of n integers and an integer target, are there elements a, b, c, and d in nums such that a + b + c + d = target? Find all unique quadruplets in the array which gives the sum of target.

Note:
The solution set must not contain duplicate quadruplets.

Example:
Given array nums = [1, 0, -1, 0, -2, 2], and target = 0.
A solution set is:
[
  [-1,  0, 0, 1],
  [-2, -1, 1, 2],
  [-2,  0, 0, 2]
]
 */
package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        int len = nums.length;
        if (nums == null || len < 4) {
            return res;
        }
        Arrays.sort(nums);
        return kSum(nums, target, 4, 0);
    }

    public static List<List<Integer>> kSum(int[] nums, int target, int k, int index) {
        if (index >= nums.length) {
            return null;
        }

        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k == 2) {
            int i = index, j = nums.length - 1;
            while(i < j) {
                //find a pair
                if(target - nums[i] == nums[j]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(target-nums[i]);
                    res.add(temp);
                    //skip duplication
                    while(i<j && nums[i]==nums[i+1]) {
                        i++;
                    }
                    while(i<j && nums[j-1]==nums[j]) {
                        j--;
                    }
                    i++;
                    j--;
                    //move left bound
                } else if (target - nums[i] > nums[j]) {
                    i++;
                    //move right bound
                } else {
                    j--;
                }
            }
        } else {
            for (int i = index; i < nums.length - k + 1; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                List<List<Integer>> list = kSum(nums, target - nums[i], k - 1, i + 1);
                if (list != null && list.size() > 0) {
                    for (List<Integer> val : list) {
                        val.add(0, nums[i]);
                    }
                    res.addAll(list);
                }
            }
        }
        return res;
    }
}
