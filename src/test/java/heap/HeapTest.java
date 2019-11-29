package heap;

import org.junit.Assert;
import org.junit.Test;

public class HeapTest {

    @Test
    public void findKthTest(){
        int kthLargest = FindKthElement.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2);
        Assert.assertEquals(kthLargest,5);
    }
}
