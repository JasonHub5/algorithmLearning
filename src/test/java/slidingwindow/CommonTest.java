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
}
