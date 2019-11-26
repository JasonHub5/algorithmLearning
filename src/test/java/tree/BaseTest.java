package tree;

import org.junit.Assert;
import org.junit.Test;
import tree.base.CreateTree;
import tree.base.IterativeInorderTraversal;
import tree.base.IterativePostorderTraversal;
import tree.base.IterativePreorderTraversal;

public class BaseTest {
    @Test
    public void createTest() {
        TreeNode tree = CreateTree.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        tree.print();
    }

    @Test
    public void createBtTest() {
        TreeNode binaryTree = CreateTree.createBinaryTree(new int[]{5, 3, 7, 2, 4, 6, 8, 1, 9});
        binaryTree.print();
    }

    /**
     * 先序
     */
    @Test
    public void IterativePreorderTraversalTest() {
        TreeNode tree = CreateTree.create(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
        IterativePreorderTraversal.print(tree);
    }

    /**
     * 顺序
     */
    @Test
    public void IterativeInorderTraversalTest() {
        TreeNode tree = CreateTree.createBinaryTree(new int[]{5, 3, 7, 2, 4, 6, 8, 1, 9});
        tree.print();
        System.out.println();
        IterativeInorderTraversal.print(tree);
    }

    /**
     * 后序
     */
    @Test
    public void IterativePostorderTraversalTest() {
        TreeNode tree = CreateTree.create(new int[]{5, 4, 6, 2, 3, 7, 8, 1, 9});
        IterativePostorderTraversal.print(tree);
    }

    @Test
    public void IsBSTreeTest() {
        TreeNode binaryTree = CreateTree.createBinaryTree(new int[]{5, 3, 7, 2, 4, 6, 8, 1, 9});
        boolean isBSTree = IsBSTree.check(binaryTree);
        Assert.assertEquals(isBSTree, true);

        TreeNode binaryTree2 = CreateTree.create(new int[]{5, 3, 7, 2, 4, 6, 8, 1, 9});
        boolean isBSTree2 = IsBSTree.check(binaryTree2);
        Assert.assertEquals(isBSTree2, false);
    }
}
