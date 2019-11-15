package binarysearch;

import org.junit.Assert;
import org.junit.Test;

public class FindFirstCloseEqualTest {
    @Test
    public void gleTest() {
        int index1 = FindFirstCloseEqual.firstGreaterThanEqual(new int[]{1, 2, 2, 2, 2, 4}, 2);
        Assert.assertEquals(index1, 1);
        int index2 = FindFirstCloseEqual.firstGreaterThanEqual(new int[]{1, 2, 2, 2, 2, 4}, 3);
        Assert.assertEquals(index2, 5);
        int index3 = FindFirstCloseEqual.firstGreaterThanEqual(new int[]{1, 2, 2, 2, 2, 4}, 0);
        Assert.assertEquals(index3, 0);
    }

    @Test
    public void  glTest(){
        int index1 = FindFirstCloseEqual.firstGreaterThan(new int[]{1, 2, 2, 2, 2, 4}, 2);
        Assert.assertEquals(index1, 5);
        int index2 = FindFirstCloseEqual.firstGreaterThan(new int[]{1, 2, 2, 2, 2, 4}, 3);
        Assert.assertEquals(index2, 5);
        int index3 = FindFirstCloseEqual.firstGreaterThan(new int[]{1, 2, 2, 2, 2, 4}, 0);
        Assert.assertEquals(index3, 0);
    }

    @Test
    public void lte2Test() {
        int index1 = FindFirstCloseEqual.firstGreaterThanEqual2(new int[]{1, 2, 2, 2, 2, 4}, 2);
        Assert.assertEquals(index1, 4);
        int index2 = FindFirstCloseEqual.firstGreaterThanEqual2(new int[]{1, 2, 2, 2, 2, 4}, 3);
        Assert.assertEquals(index2, 5);
        int index3 = FindFirstCloseEqual.firstGreaterThanEqual2(new int[]{1, 2, 2, 2, 2, 4}, 0);
        Assert.assertEquals(index3, 0);
    }
}
