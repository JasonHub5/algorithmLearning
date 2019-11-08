/*
Given a collection of distinct integers, return all possible permutations.

Example:

Input: [1,2,3]
Output:
[
  [1,2,3],
  [1,3,2],
  [2,1,3],
  [2,3,1],
  [3,1,2],
  [3,2,1]
]
*
* */
package recusion;

import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public static List<List<Integer>> permutation(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        createItem(list, new ArrayList<Integer>(), nums);
        return list;
    }

    private static void createItem(List<List<Integer>> list, List<Integer> item, int[] nums) {
        if (item.size() == nums.length) {
            list.add(new ArrayList<Integer>(item));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (item.contains(nums[i])) {
                    continue;
                }
                item.add(nums[i]);
                createItem(list, item, nums);
                item.remove(item.size() - 1);
            }
        }
    }

}
