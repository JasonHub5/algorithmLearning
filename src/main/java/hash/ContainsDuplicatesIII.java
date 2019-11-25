/*
220. Contains Duplicate III
Medium
Given an array of integers, find out whether there are two distinct indices i and j in the array such that the absolute difference between nums[i] and nums[j] is at most t and the absolute difference between i and j is at most k.

Example 1:

Input: nums = [1,2,3,1], k = 3, t = 0
Output: true
Example 2:

Input: nums = [1,0,1,1], k = 1, t = 2
Output: true
Example 3:

Input: nums = [1,5,9,1,5,9], k = 2, t = 3
Output: false

 */
package hash;

import java.util.HashMap;

public class ContainsDuplicatesIII {

    /**
     * 这个解法非常妙
     *
     * 题意找到一组数，nums[i] and nums[j] 他们idx差值在k以内， 即 j - i <= k.
     * 他们的差的绝对值在t以内，即 Math.abs(nums[i] - nums[j]) <= t.
     * 我们可以构建一个大小为t+1的bucket, 比如[0, 1, 2, 3, ... , t] 最大绝对值差的两个数就是t和0.
     * 如果两个数字出现在同一个Bucket内，说明我们已经找到了。 如果不是，则在相邻的两个bucket内再找。
     * 如果相邻的bucket内元素绝对值只差在t以内，说明我们知道到了，返回true.
     * 为了保证j - i <= k，我们在i>=k时，删除 nums[i-k]对应的Bucket.
     * @param nums
     * @param k
     * @param t
     * @return
     */
    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        HashMap<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long remappedNum = (long) nums[i] - Integer.MIN_VALUE;
            long bucket = remappedNum / ((long) t + 1);
            if (map.containsKey(bucket)
                    || (map.containsKey(bucket - 1) && remappedNum - map.get(bucket - 1) <= t)
                    || (map.containsKey(bucket + 1) && remappedNum - map.get(bucket + 1) <= t)) {
                return true;
            }
            if (i >= k) {
                long lastBucket = nums[i - k] - Integer.MIN_VALUE / ((long) t + 1);
                map.remove(lastBucket);
            }
            map.put(bucket, remappedNum);
        }
        return false;
    }
}
