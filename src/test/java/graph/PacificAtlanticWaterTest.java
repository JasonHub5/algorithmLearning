package graph;

import org.junit.Test;

import java.util.List;

public class PacificAtlanticWaterTest {
    @Test
    public void test() {
        int[][] grid = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}};
        List<List<Integer>> list = PacificAtlanticWater.pacificAtlantic(grid);
        System.out.println(list);
    }
}
