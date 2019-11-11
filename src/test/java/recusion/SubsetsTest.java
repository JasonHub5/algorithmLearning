package recusion;

import org.junit.Test;

import java.util.List;

public class SubsetsTest {

    @Test
    public void subsetsTest() {
        List<List<Integer>> subsets = Subsets.subsets(new int[]{1, 2, 3});
        System.out.println(subsets);

        List<List<Integer>> subsets2 = Subsets.subsets(new int[]{});
        System.out.println(subsets2);

        List<List<Integer>> subsets3 = Subsets.subsets(new int[]{1});
        System.out.println(subsets3);
    }

    @Test
    public void subsetsIITest(){
        List<List<Integer>> subsets = SubsetsII.subsetsII(new int[]{1, 2, 2});
        System.out.println(subsets);
    }
}
