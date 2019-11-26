package tree;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        value = x;
    }

    public void print() {
        System.out.print(this.value + " ");
        List<TreeNode> list = new ArrayList<TreeNode>();
        list.add(this.left);
        list.add(this.right);
        List<TreeNode> nextList = null;
        while (list != null && list.size() > 0) {
            nextList = new ArrayList<TreeNode>();
            for (TreeNode node : list) {
                if (node != null) {
                    System.out.print(node.value + " ");
                    nextList.add(node.left);
                    nextList.add(node.right);
                }
            }
            list = nextList;
        }
    }
}
