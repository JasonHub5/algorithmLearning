/*
417. 太平洋大西洋水流问题
给定一个 m x n 的非负整数矩阵来表示一片大陆上各个单元格的高度。“太平洋”处于大陆的左边界和上边界，而“大西洋”处于大陆的右边界和下边界。

规定水流只能按照上、下、左、右四个方向流动，且只能从高到低或者在同等高度上流动。

请找出那些水流既可以流动到“太平洋”，又能流动到“大西洋”的陆地单元的坐标。

提示：
输出坐标的顺序不重要
m 和 n 都小于150
 
示例：
给定下面的 5x5 矩阵:

  太平洋 ~   ~   ~   ~   ~
       ~  1   2   2   3  (5) *
       ~  3   2   3  (4) (4) *
       ~  2   4  (5)  3   1  *
       ~ (6) (7)  1   4   5  *
       ~ (5)  1   1   2   4  *
          *   *   *   *   * 大西洋

返回:

[[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]] (上图中带括号的单元).
 

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/pacific-atlantic-water-flow
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

 */
package graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PacificAtlanticWater {
    static int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static List<List<Integer>> pacificAtlantic(int[][] matrix) {
        //解题思路：
        //1. 左边缘出发，这些点全部能访问到太平洋， dfs 找到所有能访问的点
        //2. 右边缘出发，这些点全部能访问到大西洋， dfs 找到所有能访问的点
        //3. 合并

        if (matrix.length == 0) {
            return null;
        }

        boolean[][] visitedP = new boolean[matrix.length][matrix[0].length];
        boolean[][] visitedA = new boolean[matrix.length][matrix[0].length];
        List<int[]> listP = new ArrayList<>();
        List<int[]> listA = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            listP.add(new int[]{i, 0});
            listA.add(new int[]{i, matrix.length - 1});
        }
        for (int i = 0; i < matrix[0].length; i++) {
            listP.add(new int[]{0, i});
            listA.add(new int[]{matrix[0].length - 1, i});
        }
        for (int[] pair : listP) {
            dfs(matrix, visitedP, pair[0], pair[1]);
        }
        for (int[] pair : listA) {
            dfs(matrix, visitedA, pair[0], pair[1]);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (visitedA[i][j] && visitedP[i][j]) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }
        return result;
    }

    public static void dfs(int[][] matrix, boolean[][] visited, int currX, int currY) {
        visited[currX][currY] = true;
        for (int[] pair : dirs) {
            int nx = currX + pair[0];
            int ny = currY + pair[1];
            if (nx >= 0 && nx < matrix.length && ny >= 0 && ny < matrix[0].length && !visited[nx][ny] && matrix[nx][ny] >= matrix[currX][currY]) {
                dfs(matrix, visited, nx, ny);
            }
        }
    }
}
