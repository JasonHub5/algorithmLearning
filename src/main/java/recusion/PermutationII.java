/*
Permutation II (contains duplicates) : https://leetcode.com/problems/permutations-ii/
47. Permutations II
Medium

Given a collection of numbers that might contain duplicates, return all possible unique permutations.

Example:

Input: [1,1,2]
Output:
[
  [1,1,2],
  [1,2,1],
  [2,1,1]
]
*/

package recusion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationII {
    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();

        Arrays.sort(nums);

        createItem(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);

        return list;
    }

    public static void createItem(List<List<Integer>> list, List<Integer> item, int[] nums, boolean[] used) {
        if (item.size() == nums.length) {
            list.add(new ArrayList<>(item));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }

                if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                    continue;
                }
                used[i] = true;
                item.add(nums[i]);
                createItem(list, item, nums, used);
                used[i] = false;
                item.remove(item.size() - 1);
            }
        }
//        if (item.size() == nums.length) {
//            list.add(new ArrayList<Integer>(item));
//            return;
//        }
//        for (int i = 0; i < nums.length; i++) {
//            if (used[i]) continue;
//            if (i > 0 && nums[i - 1] == nums[i] && !used[i - 1]) continue;
//            used[i] = true;
//            item.add(nums[i]);
//            createItem(list, item, nums, used);
//            used[i] = false;
//            item.remove(item.size() - 1);
//        }

    }
}
