/*
309.最佳买卖股票时机含冷冻期
给定一个整数数组，其中第 i 个元素代表了第 i 天的股票价格 。​

设计一个算法计算出最大利润。在满足以下约束条件下，你可以尽可能地完成更多的交易（多次买卖一支股票）:

你不能同时参与多笔交易（你必须在再次购买前出售掉之前的股票）。
卖出股票后，你无法在第二天买入股票 (即冷冻期为 1 天)。
示例:

输入: [1,2,3,0,2]
输出: 3
解释: 对应的交易状态为: [买入, 卖出, 冷冻期, 买入, 卖出]

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-with-cooldown
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
package dp;

public class BuyAndSellStockV {
    public static int maxProfit(int[] prices) {
        int[] buy = new int[prices.length];
        int[] profite = new int[prices.length];

        buy[0] = -prices[0];
        profite[0] = 0;
        buy[1] = Math.max(buy[0], -prices[1]);
        profite[1] = Math.max(profite[0], prices[1] + buy[0]);

        for (int i = 2; i < prices.length; i++) {
            buy[i] = Math.max(buy[i - 1], profite[i - 2] - prices[i]);
            profite[i] = Math.max(profite[i - 1], buy[i - 1] + prices[i]);
        }
        return profite[prices.length - 1];
    }

    /*
    * 总结：
    * 两个数组：
    * Cash - 指当前可以获取的最大利润
    * Hold - 指当前手中持有股票的情况所有的利润
    * ==> Cash[i] = Max(Cash[i-1], Hold[i-1] + price[i])
    * ==> Hold[i] = Max(Hold[i-1], Cash[i-2] - price[i])
    * */
}
