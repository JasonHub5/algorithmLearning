package binarysearch;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMinimumTest {
    @Test
    public void findMinimumTest() {
        int min = FindMinimum.findMin(new int[]{3, 4, 5, 1, 2});
        Assert.assertEquals(min, 1);

        int min1 = FindMinimum.findMin(new int[]{4, 5, 6, 7, 0, 1, 2});
        Assert.assertEquals(min1, 0);
    }

    @Test
    public void findFirstAndLastTest() {
        int[] ints = FindFirstAndLast.searchRange(new int[]{5, 7, 7, 8, 8, 8, 10}, 8);
        Assert.assertEquals(ints[0], 3);
        Assert.assertEquals(ints[1], 5);

        int[] ints1 = FindFirstAndLast.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 4);
        Assert.assertEquals(ints1[0], -1);
        Assert.assertEquals(ints1[1], -1);
    }

    @Test
    public void findClosestElemetsTest() {
        List<Integer> closestElements = FindClosestElements.findClosestElements(Arrays.asList(1, 2, 3, 4, 5), 4, 3);
        System.out.println(closestElements);

        int closestIndex = FindClosestElements.findClosestIndex(new int[]{1, 2, 2, 2, 4, 4, 4, 6}, 2);
        System.out.println(closestIndex);
    }
}
