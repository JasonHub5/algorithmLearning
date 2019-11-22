# 链表
单向链表  
双向链表
![image](https://img-blog.csdn.net/20180724111803616?watermark/2/text/aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80MTU4MjE5Mg==/font/5a6L5L2T/fontsize/400/fill/I0JBQkFCMA==/dissolve/70)

[链表的基本操作](MyLinkList.java)  
```
class LNode{
    T Data
    LNode next
}

class MyLinkList{
    Node head
    addFirst(LNode node)
    addLast(LNode node)
    insertAfter(LNode node)
    insertBefore(LNode node)
    findByIndex(int index)
    deleteFirst()
    deleteLast()
    deleteIndex(int index)
    deleteNode(LNode node)
}

```

## 例题
* [找中间节点](FindMidNode.java)
* [是否有环](HasCircle.java)
* [环的开始](BeginningOfLoop.java)  
思路  
![](https://raw.githubusercontent.com/JasonHub5/algorithmLearning/master/files/start_of_circle.png)
* [删除链表第K个尾节点](RemoveNthEnd.java)
* [合并两个排序链表](MergeTwoList.java)
    * 繁杂写法
    * 简洁写法
    * 递归写法
* [Intersetion of Two Linked lists(交叉链表)](IntersectionNode.java)
* [Insertion Sort List(插入排序链表)](InsertionSortList.java)
* [Sort List(归并)](MergeSortList.java)
* Partition List
* [Reverse a Linked List](ReverseLinkList.java)
* Reverse a Linked List II
* Reverse a Linked List III
* Reverse a Linked List IV
* Palindrome Linked List
* Remove Duplications from Sorted List
