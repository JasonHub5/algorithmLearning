/*
用给定的几种钱币凑成某个钱数
例如：给定了6种钱币面值为2、5、10、20、50、100，用来凑  15元，可以用5个2元、1个5元，或者3个5元，或者1个5元、1个10元，等等。
显然，最少需要2个钱币才能凑成15元

 */

package greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinCoins {
    private static int[] coins = {1, 2, 5, 10, 20, 50, 100};

    public static List<Integer> minCoins(int target) {
        List<Integer> result = new ArrayList<>();
        int index = coins.length - 1;
        while (target != 0) {
            if (target - coins[index] >= 0) {
                result.add(coins[index]);
                target = target - coins[index];
            } else {
                index--;
            }
        }
        return result;
    }
}
