package greedy;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CommonTest {
    @Test
    public void minCoinsTest() {
        List<Integer> integers = MinCoins.minCoins(93);
        System.out.println(integers);
    }

    @Test
    public void activityProblemTest() {
        List<int[]> ints = ActivityProblem.activityProblem(Arrays.asList(new int[]{0, 6}, new int[]{3, 4}, new int[]{1, 2}, new int[]{5, 7}, new int[]{8, 9}, new int[]{5, 9}));
        for (int i = 0; i < ints.size(); i++) {
            System.out.print("(" + ints.get(i)[0]);
            System.out.print(", " + ints.get(i)[1] + ")");
            System.out.println();
        }
    }

    @Test
    public void findSmallestTest() {
        int smallest = FindSmallest.findSmallest2(9, 2);
        Assert.assertEquals(smallest, 18);

        int smallest2 = FindSmallest.findSmallest2(20, 3);
        Assert.assertEquals(smallest2, 299);
    }

    @Test
    public void minimumSumTest() {
        int sum1 = MinimumSum.minimumSum(new int[]{6, 8, 4, 5, 2, 3});
        Assert.assertEquals(sum1, 604);

        int sum2 = MinimumSum.minimumSum(new int[]{5, 3, 0, 7, 4});
        Assert.assertEquals(sum2, 82);
    }

    @Test
    public void ropeCostTest() {
        int cost = RopeCost.ropeCost(new int[]{4, 3, 2, 6});
        Assert.assertEquals(cost, 29);
    }

    @Test
    public void findPlatForm() {
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int n = arr.length;
        int platform = FindPlatForm.findPlatform2(arr, dep, n);
        Assert.assertEquals(platform, 3);
    }

    @Test
    public void jumpGameTest() {
        boolean canJump = JumpGame.canJump(new int[]{2, 3, 1, 1, 4});
        Assert.assertEquals(canJump, true);

        boolean canJump2 = JumpGame.canJump(new int[]{3, 2, 1, 0, 4});
        Assert.assertEquals(canJump2, false);
    }

    @Test
    public void WiggleSubsequenceTest() {
        int count1 = WiggleSubsequence.wiggleMaxLength(new int[]{1, 17, 5, 10, 13, 15, 10, 5, 16, 8});
        Assert.assertEquals(count1, 7);

        int count2 = WiggleSubsequence.wiggleMaxLength(new int[]{1, 7, 4, 9, 2, 5});
        Assert.assertEquals(count2, 6);

        int count3 = WiggleSubsequence.wiggleMaxLength(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        Assert.assertEquals(count3, 2);
    }
}
