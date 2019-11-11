/*
90. Subsets II
Medium

Given a collection of integers that might contain duplicates, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: [1,2,2]
Output:
[
  [2],
  [1],
  [1,2,2],
  [2,2],
  [1,2],
  []
]
 */

package recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static List<List<Integer>> subsetsII(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);
        createItem(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }

    public static void createItem(List<List<Integer>> list, List<Integer> item, int[] nums, int start) {
        if (item != null) {
            list.add(new ArrayList<Integer>(item));
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            item.add(nums[i]);
            createItem(list, item, nums, i + 1);
            item.remove(item.size() - 1);
        }
    }
}
