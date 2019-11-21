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
* [删除链表第K个尾节点](RemoveNthEnd.java)