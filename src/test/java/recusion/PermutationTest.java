package recusion;

import org.junit.Test;

import java.util.List;

public class PermutationTest {

    @Test
    public void permutationTest() {
        List<List<Integer>> permutation = Permutation.permutation(new int[]{1, 2, 3});
        System.out.println(permutation);
    }

    @Test
    public void permutation2Test(){
        List<List<Integer>> permutation = Permutation.permutation2(new int[]{1, 2, 3});
        System.out.println(permutation);
    }

    @Test
    public void permutationIITest(){
        List<List<Integer>> permutation = PermutationII.permuteUnique(new int[]{1, 1, 3});
        System.out.println(permutation);
    }
}
