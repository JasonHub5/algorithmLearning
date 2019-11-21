/*
对数组做逆序对计数
在形式上，如果有两个元素a[i]、a[j]，如果a[i] > a[j] 且 i < j，那么a[i],a[j]就构成一个逆序对
例如序列 2, 4, 1, 3, 5 有三个逆序对，分别是 (2, 1), (4, 1), (4, 3)
 */

package dc;

import java.util.Arrays;

public class ReversePairs {
    static int count = 0;

    public static int reversPairs(int[] nums) {
        if (nums == null || nums.length <= 1) {
            return 0;
        }

        countReversPairs(nums);
        return count;
    }

    public static int[] countReversPairs(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }

        int mid = arr.length / 2;
        int[] left = countReversPairs(Arrays.copyOfRange(arr, 0, mid));
        int[] right = countReversPairs(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];

        int i = 0, j = 0;
        boolean flag = false;
        for (int index = 0; index < result.length; index++) {
            if (i >= left.length) {
                result[index] = right[j++];
            } else if (j >= right.length) {
                result[index] = left[i++];
            } else if (left[i] < right[j]) {
                result[index] = left[i++];
            } else if (left[i] == right[j]) {
                result[index] = right[j++];
            } else {
                if (!flag) {
                    count += (right.length - j) * (left.length - i);
                    flag = true;
                }
                result[index] = right[j++];
            }
        }
        return result;
    }
}
