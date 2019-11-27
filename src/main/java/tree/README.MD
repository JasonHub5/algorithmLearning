# 树

## 二叉树的构造
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { 
        val = x; 
    }
}
```
## 树据基本操作
* [先序遍历](base/IterativePreorderTraversal.java)
* [后序遍历](base/IterativePostorderTraversal.java)
* [中序遍历](base/IterativeInorderTraversal.java)
* [层高](base/HighOfTree.java)
* [节点数](base/CountNode.java)
 ### 二叉树
 所有父节点至多有两个孩子节点
 ```
            3
         /   \
       9     20
     /     /   \
    1      15   7
```
 ### 二叉排序树
 1. 符合二叉树
 2. 对于任意一个父节点，所有左边子节点都小于它，所有右子节点都大于它
  ```
             15
          /     \
        7       20
      /  \     /   
     1    9   13   
 ```
 ### 完全二叉树(Complete Binary Tree)
若设二叉树的深度为 h，除第 h 层外，其它各层 (1～h-1) 的结点数都达到最大个数，第 h 层所有的结点都连续集中在最左边，这就是完全二叉树。
1. 是科二叉树
2. 除了最后一层，其余层都是满节点


## 练习
* [是否是一棵二叉排序树](IsBSTree.java)
* [Binary Tree Level Order Traversal](LevelOrderTraversal.java)
* [Construct Binary Tree from Preorder and Inorder Traversal](BulidTreeByPreAndInorder.java)
