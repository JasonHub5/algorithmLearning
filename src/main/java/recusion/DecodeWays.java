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


package recusion;

import java.util.ArrayList;
import java.util.List;

//这道题的解法一和 [131. Palindrome Partitioning] 相同



public class DecodeWays {

    //解法一 DFS同 131.Palindrome Partitioning
    public static int decodeWaysS1(String s) {
        List<List<String>> list = new ArrayList<>();
        createItem(list, new ArrayList<String>(), s, 0);
        System.out.println(list);
        return list.size();
    }

    private static void createItem(List<List<String>> list, List<String> tempList, String s, int start) {
        if (start > s.length() - 1) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            String sub = s.substring(start, i + 1);
            if (Integer.parseInt(sub) <= 26) {
                tempList.add(sub);
                createItem(list, tempList, s, i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    //解法二 动态规划 DP
//DP解法相似题：
// 62. Unique Paths (https://leetcode.com/problems/unique-paths/)
//70. Climbing Stairs (https://leetcode.com/problems/climbing-stairs/)
//509. Fibonacci Number (https://leetcode.com/problems/fibonacci-number/)
    public static int numDecodings(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) == '0' ? 0 : 1;
        for (int i = 2; i <= n; i++) {
            int first = Integer.parseInt(s.substring(i - 1, i));
            int second = Integer.parseInt(s.substring(i - 2, i));
            if (first > 0 && first < 9) {
                dp[i] += dp[i - 1];
            }

            if (second > 10 && second < 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}
