package tree;

import org.junit.Test;

public class BulidTreeByPreAndInorderTest {
    @Test
    public void test() {
        TreeNode tree = BuildTreeByPreAndInorder.buildTree(new int[]{3, 9, 6, 21, 11, 8, 20, 15, 7}, new int[]{21, 6, 11, 9, 8, 3, 15, 20, 7});
        tree.print();
    }
}
