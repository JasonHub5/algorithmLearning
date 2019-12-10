package slidingwindow;

import org.junit.Assert;
import org.junit.Test;

public class CommonTest {
    @Test
    public void removeDuplicatesTest() {
        int lenght = RemoveDuplicates.removeDuplicates(new int[]{1, 1, 2});
        Assert.assertEquals(lenght, 2);

        int lenght2 = RemoveDuplicates.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        Assert.assertEquals(lenght2, 5);
    }

    @Test
    public void removeDuplicatesIITest() {
        int lenght = RemoveDuplicatesII.removeDuplicates(new int[]{1, 1, 1, 2, 2, 3});
        Assert.assertEquals(lenght, 5);

        int lenght2 = RemoveDuplicatesII.removeDuplicates(new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3});
        Assert.assertEquals(lenght2, 7);

        int lenght3 = RemoveDuplicatesII.removeDuplicates(new int[]{0, 1, 1, 1, 1, 2, 3, 3});
        Assert.assertEquals(lenght3, 6);
    }

    @Test
    public void removeElementTest() {
        int length = removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);
        Assert.assertEquals(length, 5);
    }

    @Test
    public void maximumAverageSubarrayITest() {
        double maxAverage = MaximumAverageSubarrayI.findMaxAverage(new int[]{1, 12, -5, -6, 50, 3}, 4);
        System.out.println(maxAverage);
    }

    @Test
    public void findMaxAverageTest() {
        int maxAverage = LongestContinuousSubsequence.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7});
        Assert.assertEquals(maxAverage, 3);
    }

    @Test
    public void minimumSizeSubarraySumTest() {
        int min = MinimumSizeSubarraySum.minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3});
        Assert.assertEquals(min, 2);
    }

    @Test
    public void implStrStrTest() {
        int index = ImplStrStr.strStr("hello", "ll");
        Assert.assertEquals(index, 2);

        int index2 = ImplStrStr.strStr("helafewafjoaijlo", "wafjof");
        Assert.assertEquals(index2, -1);

        int index3 = ImplStrStr.strStr("abcdelmmfghijklmn", "lmn");
        Assert.assertEquals(index3, 14);
    }

    @Test
    public void subarrayProductLessThanKTest() {
        int count = SubarrayProductLessThanK.numSubarrayProductLessThanK(new int[]{10, 5, 2, 6}, 100);
        System.out.println(count);
    }

    @Test
    public void longestSubstringWithoutRepeatingTest() {
        int index = LongestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbb");
        Assert.assertEquals(index, 3);

        int index2 = LongestSubstringWithoutRepeating.lengthOfLongestSubstring("bbbbb");
        Assert.assertEquals(index2, 1);

        int index3 = LongestSubstringWithoutRepeating.lengthOfLongestSubstring("pwwkew");
        Assert.assertEquals(index3, 3);
    }
}
