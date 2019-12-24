/*
给定一个有n行n列的棋盘，每个格子上有不同的值代表格子的价值。
目标是找到获利最大的移动路线（从第一行的某个格子到最后一行的某个格子）
移动方法：
    1. 移动到下一行的之前一行（up then left）
    2. 移动到下一行（up）
    3. 移动到下一行的下一列（up and right)
 */
package dp;

public class MovingBoard {
    public static int movingBoard(int[][] board) {
        int max = Integer.MIN_VALUE;
        for (int i = 1; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (j == 0) {
                    board[i][j] = Math.max(board[i - 1][j], board[i - 1][j + 1]) + board[i][j];
                } else if (j == board[0].length - 1) {
                    board[i][j] = Math.max(board[i - 1][j - 1], board[i - 1][j]) + board[i][j];
                } else {
                    board[i][j] = Math.max(Math.max(board[i - 1][j - 1], board[i - 1][j]), board[i - 1][j + 1]) + board[i][j];
                }
                max = Math.max(max, board[i][j]);
            }
        }
        return max;
    }
}
