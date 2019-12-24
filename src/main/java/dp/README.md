# 动态规划

### 练习  
* [入室抢劫I](HouseRobber.java)
* [入室抢劫II](HouseRobberII.java)
* [入室抢劫III](HouseRobberIII.java)
* 组织聚会
* 瓷砖问题  
    f(n) = f(n-1) + f(n-2)
* [最小台阶问题](MinCostClimbingStairs.java)
* [解码方式](DecodeWays.java)  
    本题的[递归解法](../recusion/DecodeWays.java)
* 独特二叉树搜索路径  
<a href="https://www.codecogs.com/eqnedit.php?latex=X_n&space;=&space;\sum_{i=0}^{n}X_{i-1}*X_{n-i}" target="_blank"><img src="https://latex.codecogs.com/gif.latex?X_n&space;=&space;\sum_{i=0}^{n}X_{i-1}*X_{n-i}" title="X_n = \sum_{i=0}^{n}X_{i-1}*X_{n-i}" /></a>   
这个称为Catalan Number(卡特兰数)
* [最大子序列乘积](MaximumProductSubarray.java)
* [买卖股票I](BuyAndSellStockI.java)
* [买卖股票II](BuyAndSellStockII.java)
* [买卖股票III](BuyAndSellStockIII.java)
* [买卖股票V(最佳买卖股票时机含冷冻期)](BuyAndSellStockV.java)
* [买卖股票(含手续费)](BuyAndSellStockWithFee.java)
* 买卖股票IV
```
股票题总结
    两个数组：
    Cash - 指当前手中不持有股票，可以获取的最大利润
    Hold - 指当前手中持有股票的情况所有的利润
    ==> Cash[i] = Max(Cash[i-1], Hold[i-1] + price[i])
        1. 昨天卖出了，今天不操作
        2. 昨天持有股票，今天卖出
    ==> Hold[i] = Max(Hold[i-1], Cash[i-1] - price[i])
        1. 前一天持有，今天不操作；
        2. 前一天不持有，今天买入
        
    空间复杂度优化：某些情况两个数组可以用两个变量实现
```

* [独特路径](UniquePath.java)
* [在棋盘上移动](MovingBoard.java)
* [最大正方形](MaxSquare.java)
* 0-1背包问题I
* 0-1背包问题II
* [最大公共子序列(LCS)](LongestCommonSubsequence.java)
* [最大递增子序列(LIS)](LongestIncreaseSubsequence.java)
