package dc;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class PublicTest {
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
}
