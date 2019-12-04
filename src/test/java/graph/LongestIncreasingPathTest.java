package graph;

import org.junit.Assert;
import org.junit.Test;

public class LongestIncreasingPathTest {
    @Test
    public void test() {
        int[][] nums = {
                {9, 9, 4},
                {6, 6, 8},
                {2, 1, 1}};
        int path = LongestIncreasingPath.longestIncreasingPath(nums);
        Assert.assertEquals(path, 4);
    }
}
