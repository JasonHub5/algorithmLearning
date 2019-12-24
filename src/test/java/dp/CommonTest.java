package dp;

import org.junit.Assert;
import org.junit.Test;

public class CommonTest {
    @Test
    public void houseRobberTest() {
        int max = HouseRobber.rob(new int[]{2, 7, 9, 3, 1});
        Assert.assertEquals(max, 12);
    }

    @Test
    public void houseRobberIITest() {
        int max = HouseRobberII.rob(new int[]{2, 3, 2});
        Assert.assertEquals(max, 3);

        int max2 = HouseRobberII.rob(new int[]{1, 2, 3, 1});
        Assert.assertEquals(max2, 4);
    }

    @Test
    public void houseRobberIIITest() {
        HouseRobberIII.TreeNode root = new HouseRobberIII.TreeNode(3);
        root.left = new HouseRobberIII.TreeNode(4);
        root.left.left = new HouseRobberIII.TreeNode(1);
        root.left.right = new HouseRobberIII.TreeNode(3);
        root.right = new HouseRobberIII.TreeNode(5);
        root.right.right = new HouseRobberIII.TreeNode(1);

        int value = HouseRobberIII.rob(root);
        Assert.assertEquals(value, 9);
    }

    @Test
    public void minCostClimbingStairsTest() {
        int min = MinCostClimbingStairs.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        Assert.assertEquals(min, 6);
    }

    @Test
    public void decodeWaysS1Test() {
        int result = DecodeWays.decodeWaysS1("226");
        Assert.assertEquals(result, 3);

        int result2 = DecodeWays.decodeWaysS1("206");
        Assert.assertEquals(result2, 1);


        int result3 = DecodeWays.decodeWaysS1("2061022");
        Assert.assertEquals(result3, 2);
    }

    @Test
    public void maximumProductSubarrayTest() {
        int max = MaximumProductSubarray.maxProduct(new int[]{2, 3, -2, 4});
        Assert.assertEquals(max, 6);
    }

    @Test
    public void buyAndSellStockITest() {
        int maxProfit = BuyAndSellStockI.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(maxProfit, 5);

        int maxProfit2 = BuyAndSellStockI.maxProfit(new int[]{7, 6, 4, 3, 1});
        Assert.assertEquals(maxProfit2, 0);
    }

    @Test
    public void buyAndSellStockIITest() {
        int profit = BuyAndSellStockII.maxProfit(new int[]{7, 1, 5, 3, 6, 4});
        Assert.assertEquals(profit, 7);
    }

    @Test
    public void buyAndSellStockIIITest() {
        int profit = BuyAndSellStockIII.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4});
        Assert.assertEquals(profit, 6);
    }

    @Test
    public void buyAndSellStockVTest() {
        int profit = BuyAndSellStockV.maxProfit(new int[]{1, 2, 3, 0, 2});
        Assert.assertEquals(profit, 3);
    }

    @Test
    public void buyAndSellStockWithFeeTest() {
        int profit = BuyAndSellStockWithFee.maxProfit(new int[]{1, 3, 2, 8, 4, 9}, 2);
        Assert.assertEquals(profit, 8);
    }

    @Test
    public void uniquePathTest() {
        int count = UniquePath.uniquePaths(7, 3);
        int count2 = UniquePath.uniquePaths2(7, 3);
        Assert.assertEquals(count, 28);
        Assert.assertEquals(count2, 28);
    }

    @Test
    public void movingBoard() {
        int[][] board = {{-2, -1, 0, -3, 1}, {1, 3, 5, 4, 2}, {3, 5, 2, 0, 4}, {2, 3, 1, 4, 2}};
        int max = MovingBoard.movingBoard(board);
        Assert.assertEquals(max, 13);
    }

    @Test
    public void maxSquareTest() {
        char[][] matrix = {{'1', '0', '1', '0', '0'}, {'1', '0', '1', '1', '1'}, {'1', '1', '1', '1', '1'}, {'1', '0', '0', '1', '0'}};
        int max = MaxSquare.maximalSquare(matrix);
        Assert.assertEquals(max, 2);
    }

    @Test
    public void lcsTest() {
        int lcs1 = LongestCommonSubsequence.lcs("10011", "01101");
        Assert.assertEquals(lcs1, 3);


        int lcs2 = LongestCommonSubsequence.lcs("abcefg", "abcgfcefg");
        Assert.assertEquals(lcs2, 6);
    }

    @Test
    public void lisTest() {
        int length = LongestIncreaseSubsequence.lis2(new int[]{14, 22, 9, 33, 21, 50, 41, 60, 80});
        Assert.assertEquals(length, 6);
    }
}
