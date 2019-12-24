package dp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestIncreaseSubsequence {

    /**
     * 解法一：利用LCS解法
     *
     * @param str
     * @return
     */
    public static int lis1(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        String s2 = String.valueOf(chars);
        return LongestCommonSubsequence.lcs(str, s2);
    }

    public static int lis2(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > list.get(list.size() - 1)) {
                list.add(nums[i]);
            } else {
                int target = 0;
                for (int j = 0; j < list.size(); j++) {
                    if (list.get(j) > nums[i]) {
                        target = j - 1;
                        break;
                    }
                }
                target = target > 0 ? target : 0;
                list.set(target, nums[i]);
            }
        }
        return list.size();
    }
}
