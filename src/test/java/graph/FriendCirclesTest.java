package graph;

import org.junit.Assert;
import org.junit.Test;

public class FriendCirclesTest {
    @Test
    public void test(){
        int[][] M = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int circleNum = FriendCircles.findCircleNum(M);
        Assert.assertEquals(circleNum,2);
    }
}
