/*
39. Combination Sum (https://leetcode.com/problems/combination-sum/)
Medium

Given a set of candidate numbers (candidates) (without duplicates) and a target number (target), find all unique combinations in candidates where the candidate numbers sums to target.

The same repeated number may be chosen from candidates unlimited number of times.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.

Example 1:
Input: candidates = [2,3,6,7], target = 7,
A solution set is:
[
  [7],
  [2,2,3]
]

Example 2:
Input: candidates = [2,3,5], target = 8,
A solution set is:
[
  [2,2,2,2],
  [2,3,3],
  [3,5]
]
 */

package recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

    public static List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> list = new ArrayList<>();
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
                item.add(nums[i]);
                createItem(list, item, nums, i, target);
                item.remove(item.size() - 1);
            }
        }
    }
}
