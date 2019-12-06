package twopointers;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CommonTest {
    @Test
    public void reverseStringTest() {
        ReverseString.reverseString(new char[]{'h', 'e', 'l', 'l', 'o'});
    }

    @Test
    public void twoSumTest() {
        int[] ints = TwoSum.twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(ints[0], 0);
        Assert.assertEquals(ints[1], 1);
    }

    @Test
    public void threeSumTest() {
        List<List<Integer>> list = ThreeSum.threeSum(new int[]{-1, 0, 1, 2, -1, -4});
        System.out.println(list);
    }

    @Test
    public void fourSumTest() {
        List<List<Integer>> list = FourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);
        System.out.println(list);
    }

    @Test
    public void minValueOfTwoArraysTest() {
        int[] min = MinValueOfTwoArrays.findMin(new int[]{1, 3, 4, 6, 12}, new int[]{8, 11, 15});
        Assert.assertEquals(min[0], 4);
        Assert.assertEquals(min[1], 1);
    }

    @Test
    public void maxSubstringTest() {
        int[] ints = MaxSubstring.maxSubstring(new int[]{4, 17, 12, 1, 2, 3, 6}, 17);
        Assert.assertEquals(ints[0], 1);
        Assert.assertEquals(ints[1], 1);

        int[] ints2 = MaxSubstring.maxSubstring2(new int[]{4, 20, 12, 1, 2, 3, 6}, 17);
        Assert.assertEquals(ints2[0], 2);
        Assert.assertEquals(ints2[1], 4);
    }

    @Test
    public void majorityTest() {
        int element = MajorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        Assert.assertEquals(element, 2);

        int element2 = MajorityElement.majorityElement(new int[]{3, 2, 3});
        Assert.assertEquals(element2, 3);
    }

    @Test
    public void majorityIITest() {
        List<Integer> integers1 = MajorityElementII.majorityElement(new int[]{3, 2, 3});
        System.out.println(integers1);

        List<Integer> integers2 = MajorityElementII.majorityElement(new int[]{1, 1, 1, 3, 3, 2, 2, 2});
        System.out.println(integers2);
    }

    @Test
    public void sortColorTest() {
        int[] ints = SortColors.sortColors(new int[]{2, 0, 2, 1, 2, 0, 1, 0});
        for (int i : ints) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void maxAreaTest() {
        int area = MostWater.maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7});
        Assert.assertEquals(area, 49);
    }
}
