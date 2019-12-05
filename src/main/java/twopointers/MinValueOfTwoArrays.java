package twopointers;

public class MinValueOfTwoArrays {
    /*
    思路：
    由于是排序数组，用两个指针
    1, 3, 4, 6, 10
    i
    5, 8, 11, 15
    j

    如果 num1[i] < num2[j]，那么只需要滑动i，即每次滑动小的那个
     */

    public static int[] findMin(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        int[] result = new int[2];
        int min = Integer.MAX_VALUE;
        while (i < nums1.length && j < nums2.length) {
            if (Math.abs(nums1[i] - nums2[j]) < min) {
                min = Math.abs(nums1[i] - nums2[j]);
                result[0] = i;
                result[1] = j;
            }
            if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
