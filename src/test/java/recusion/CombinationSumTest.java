package recusion;

import org.junit.Test;

import java.util.List;

public class CombinationSumTest {

    @Test
    public void combinationSumTest() {

        List<List<Integer>> subsets = CombinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7);
        System.out.println(subsets);


        List<List<Integer>> subsets2 = CombinationSum.combinationSum(new int[]{2, 3, 5}, 8);
        System.out.println(subsets2);
    }

    @Test
    public void combinationSumIITest(){


//        List<List<Integer>> subsets = CombinationSumII.combinationSumII(new int[]{10,1,2,7,6,1,5}, 8);
//        System.out.println(subsets);


        List<List<Integer>> subsets2 = CombinationSumII.combinationSumII(new int[]{2,5,2,1,2}, 5);
        System.out.println(subsets2);
    }
}
