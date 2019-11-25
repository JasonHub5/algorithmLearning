package hash;

import org.junit.Assert;
import org.junit.Test;

public class HashCommonTest {

    @Test
    public void letterCountTest() {
        int i = LetterCount.letterCount("Hello word how are you I am fine thank you and you");
        Assert.assertEquals(i, 6);
    }

    @Test
    public void firstUniqueCharTest() {
        int first = FirstCharacter.firstUniqChar("givenastring");
        Assert.assertEquals(first, 2);
    }

    @Test
    public void InersecitonTest() {
        int[] intersection = IntersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2});
        for (int i : intersection) {
            System.out.println(i);
        }
    }

    @Test
    public void ContainsDupulicateIITest() {
        boolean isConatain = ContainsDuplicatesII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3);
        Assert.assertEquals(isConatain, true);
        boolean isConatain2 = ContainsDuplicatesII.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 2);
        Assert.assertEquals(isConatain2, false);
    }
}
