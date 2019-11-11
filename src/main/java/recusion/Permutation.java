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

    /**
     * permutation2
     * @param nums
     * @return
     */
    public static List<List<Integer>> permutation2(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        createItem2(list, new ArrayList<Integer>(), nums, new boolean[nums.length]);
        return list;
    }

    /**
     * 生成方法
     * 用boolean控制数组中每个正在操作的项，防止重复打印
     * @param list
     * @param item
     * @param nums
     * @param used
     */
    private static void createItem2(List<List<Integer>> list, List<Integer> item, int[] nums, boolean[] used) {
        if (item.size() == nums.length) {
            list.add(new ArrayList<Integer>(item));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (used[i]) {
                    continue;
                }

                item.add(nums[i]);
                used[i] = true;
                createItem2(list, item, nums, used);
                item.remove(item.size() - 1);
                used[i] = false;
            }
        }
    }

}
