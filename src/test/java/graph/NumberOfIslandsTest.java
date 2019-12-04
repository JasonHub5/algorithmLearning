package graph;

import org.junit.Assert;
import org.junit.Test;

public class NumberOfIslandsTest {
    @Test
    public void test() {
        int[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int num = NumberOfIslands.numIslands(grid);
        Assert.assertEquals(num, 1);
    }
}
