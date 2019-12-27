package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumSum {
    public static int minimumSum(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int num1 = 0;
        int num2 = 0;
        //排序 ---> 这步可以用堆来做 O(n)
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                num1 = num1 * 10 + nums[i];
            } else {
                num2 = num2 * 10 + nums[i];
            }
        }
        return num1 + num2;
    }
}
