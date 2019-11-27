package tree;

import org.junit.Test;
import tree.base.CreateTree;

import java.util.List;

public class LevelOrderTraversalTest {
    @Test
    public void test() {
        TreeNode tree = CreateTree.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        List<List<Integer>> list = LevelOrderTraversal.levelOrder(tree);
        System.out.println(list);
    }
}
