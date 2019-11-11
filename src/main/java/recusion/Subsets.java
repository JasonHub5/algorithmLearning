/*
78. Subsets (https://leetcode.com/problems/subsets/)
Medium

Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */

package recusion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        createItem(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    private static void createItem(List<List<Integer>> list, List<Integer> items, int[] nums, int start) {
        if (items != null) {
            list.add(new ArrayList<Integer>(items));
        }

        for (int i = start; i < nums.length; i++) {
            items.add(nums[i]);
            createItem(list, items, nums, i + 1);
            items.remove(items.size() - 1);
        }
    }
}
