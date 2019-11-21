package dc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;

public class DivideAndConquerTest {
    @Test
    public void ExponentCalculationTest() {
        long calculation1 = ExponentCalculation.calculation(7, 10);
        Assert.assertEquals(282475249, calculation1);

        long calculation2 = ExponentCalculation.calculation(1, 10);
        Assert.assertEquals(1, calculation2);

        long calculation3 = ExponentCalculation.calculation(7, 0);
        Assert.assertEquals(1, calculation3);
    }

    @Test
    public void FindPeakElementTest() {
        int peakElement = FindPeakElement.findPeakElement(new int[]{1, 2, 3, 1});
        Assert.assertEquals(peakElement, 2);

        int peakElement2 = FindPeakElement.findPeakElement(new int[]{1, 2, 1, 3, 5, 6, 4});
        Assert.assertTrue(Arrays.asList(1, 5).contains(peakElement2));
    }

    @Test
    public void FindKthElementTest() {
        int kth1 = FindKthElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assert.assertEquals(kth1, 5);

        int kth2 = FindKthElement.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4);
        Assert.assertEquals(kth2, 4);
    }

    @Test
    public void MaximumSubTest() {
        int maxSub = MaximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        Assert.assertEquals(maxSub, 6);

        int maxSub2 = MaximumSubarray.maxSubArray(new int[]{-2, -1});
        Assert.assertEquals(maxSub2, -1);

        int maxSub3 = MaximumSubarray.maxSubArray(new int[]{-2, -1, 1});
        Assert.assertEquals(maxSub3, 1);
    }

    @Test
    public void ReversePairsTest() {
        int i = ReversePairs.reversPairs(new int[]{3, 4, 2, 1});
        Assert.assertEquals(i, 5);
    }
}
