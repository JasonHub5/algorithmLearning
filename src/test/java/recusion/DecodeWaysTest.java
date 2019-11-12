package recusion;

import org.junit.Test;

import java.util.List;

public class DecodeWaysTest {
    @Test
    public void decodeWaysTest() {
        String s = "127";
        System.out.println(DecodeWays.decodeWaysS1(s));

        System.out.println(DecodeWays.numDecodings(s));
    }
}
