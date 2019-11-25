/*
349. Intersection of Two Arrays
Easy
Given two arrays, write a function to compute their intersection.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Note:

Each element in the result must be unique.
The result can be in any order.

 */
package hash;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null || nums1.length == 0 || nums2.length == 0) {
            return null;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        Set<Integer> result = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num) && !result.contains(num)) {
                result.add(num);
            }
        }
        int[] resultArr = new int[result.size()];
        int i = 0;
        for (Integer num : result) {
            resultArr[i++] = num;
        }
        return resultArr;
    }
}
