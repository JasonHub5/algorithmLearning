/*
40. Combination Sum II (https://leetcode.com/problems/combination-sum-ii/)
Medium
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */

package recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static List<List<Integer>> combinationSumII(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        createItem(list, new ArrayList<Integer>(), nums, 0, target);
        return list;
    }

    private static void createItem(List<List<Integer>> list, List<Integer> item, int[] nums, int start, int target) {
        int sum = item.stream().mapToInt(a -> a).sum();
        if (sum == target) {
            list.add(new ArrayList<>(item));
            return;
        }

        if (sum < target) {
            for (int i = start; i < nums.length; i++) {
                if (i > start && nums[i] == nums[i - 1]) {
                    continue;
                }

                item.add(nums[i]);
                createItem(list, item, nums, i + 1, target);
                item.remove(item.size() - 1);
            }
        }
    }
}
