/*
91. Decode Ways (https://leetcode.com/problems/decode-ways)
Medium

A message containing letters from A-Z is being encoded to numbers using the following mapping:

'A' -> 1
'B' -> 2
...
'Z' -> 26
Given a non-empty string containing only digits, determine the total number of ways to decode it.

Example 1:

Input: "12"
Output: 2
Explanation: It could be decoded as "AB" (1 2) or "L" (12).
Example 2:

Input: "226"
Output: 3
Explanation: It could be decoded as "BZ" (2 26), "VF" (22 6), or "BBF" (2 2 6).
 */

package dp;

public class DecodeWays {
    public static int decodeWaysS1(String s) {
        int pre = 1;
        int curr = s.charAt(0) == 0 ? 0 : 1;
        for (int i = 1; i < s.length(); i++) {
            int temp = curr;
            if (s.charAt(i) == '0') {
                pre = temp;
                continue;
            }
            int now = Integer.parseInt(s.substring(i - 1, i + 1));
            if (s.charAt(i - 1) != '0' && now <= 26) {
                curr += pre;
            }
            pre = temp;
        }
        return curr;
    }
}
