package graph;

import org.junit.Assert;
import org.junit.Test;

public class IsGraphBipartiteTest {

    @Test
    public void test() {
        int[][] graph = {{1, 3}, {0, 2}, {1, 3}, {0, 2}};
        boolean isGraph = IsGraphBipartite.isBipartite(graph);
        Assert.assertEquals(isGraph, true);

        int[][] graph2 = {{1, 3, 2}, {0, 2}, {1, 3}, {0, 2}};
        boolean isGraph2 = IsGraphBipartite.isBipartite(graph2);
        Assert.assertEquals(isGraph2, false);
    }
}
