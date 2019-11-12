package recusion;

import org.junit.Test;

import java.util.List;

public class PalindromePartitioningTest {

    @Test
    public void palindromePartitioningTest() {
        List<List<String>> list = PalindromePartitioning.partition("aaba");
        System.out.println(list);
    }
}
