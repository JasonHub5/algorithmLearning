/*
658. Find K Closest Elements
Medium
Given a sorted array, two integers k and x, find the k closest elements to x in the array. The result should also be sorted in ascending order. If there is a tie, the smaller elements are always preferred.

Example 1:
Input: [1,2,3,4,5], k=4, x=3
Output: [1,2,3,4]
Example 2:
Input: [1,2,3,4,5], k=4, x=-1
Output: [1,2,3,4]

Note:
The value k is positive and will always be smaller than the length of the sorted array.
Length of the given array is positive and will not exceed 104
Absolute value of elements in the array and x will not exceed 104
 */

package binarysearch;

import java.util.List;

public class FindClosestElements {
    public static List<Integer> findClosestElements(List<Integer> arr, int k, int x) {
        int left = 0, right = arr.size() - k - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            // for subarray starting at mid with size k+1, we compare element of two ends to eliminate the loser
            if (Math.abs(x - arr.get(mid)) > Math.abs(x - arr.get(mid+k))) {
                left = mid + 1; // arr[mid] is the one further away from x, eliminate range[left, mid]
            } else {
                right = mid - 1; // arr[mid+k] is the one further away, all [mid, right] will have simiar situation, elimiate them
            }
        }
        return arr.subList(left, left + k);
    }
}
