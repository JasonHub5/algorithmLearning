/*
How to find the smallest number with given digit sum s and number of digits d?
Examples :

Input  : s = 9, d = 2
Output : 18
There are many other possible numbers
like 45, 54, 90, etc with sum of digits
as 9 and number of digits as 2. The
smallest of them is 18.

Input  : s = 20, d = 3
Output : 299
 */
package greedy;

public class FindSmallest {
    public static int findSmallest(int sum, int m) {
        int result = 0;
        int curr = 1;
        while (sum > 0 && curr <= m) {
            for (int i = 1; i <= 9; i++) {
                if (sum - i <= (m - curr) * 9) {
                    result += i * (int) Math.pow(10, (m - curr));
                    sum -= i;
                    break;
                }
            }
            curr++;
        }
        return result;
    }

    /**
     * 贪心算法
     * @param sum
     * @param m
     * @return
     */
    public static int findSmallest2(int sum, int m) {
        if (m <= 0) {
            return -1;
        }

        if (sum > m * 9) {
            return -1;
        }

        //预留1 给最高位
        int result = 0;
        sum -= 1;
        for (int i = m - 1; i > 0; i--) {
            if (sum >= 9) {
                result += 9 * (int) Math.pow(10, (m - i - 1));
                sum -= 9;
            } else {
                result += sum * (int) Math.pow(10, (m - i - 1));
                sum = 0;
            }
        }
        result += (1 + sum) * (int) Math.pow(10, m - 1);
        return result;
    }
}
