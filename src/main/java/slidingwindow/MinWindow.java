/*
[LeetCode] 727. Minimum Window Subsequence 最小窗口序列


Given strings S and T, find the minimum (contiguous) substring W of S, so that T is a subsequence of W.

If there is no such window in S that covers all characters in T, return the empty string "". If there are multiple such minimum-length windows, return the one with the left-most starting index.

Example 1:

Input:
S = "abcdebdde", T = "bde"
Output: "bcde"
Explanation:
"bcde" is the answer because it occurs before "bdde" which has the same length.
"deb" is not a smaller window because the elements of T in the window must occur in order.


Note:

All the strings in the input will only contain lowercase letters.
The length of S will be in the range [1, 20000].
The length of T will be in the range [1, 100].
 */

package slidingwindow;

public class MinWindow {
    public static String minWindow(String s, String t) {
        int j = 0;
        int start = 0;
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == t.charAt(0) && j == 0) {
                start = i;
            }
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }

            if (j == t.length()) {
                if (result.equals("") || (i - start + 1) < result.length()) {
                    result = s.substring(start, i + 1);
                }
                start = start + 1;
                break;
            }
            if (i == s.length() - 1) {
                return result;
            }
        }
        return result;
    }
}
