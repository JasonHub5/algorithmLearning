# 图(Graph)  
### 图的基本介绍

### DFS
* 如何跟踪下一步  
 stack - 列表中只从一端添加和移除
* 如何跟踪访问过的内容  
  HashSet
* 如何跟踪从开始到目标的路径  
  HashMap
```
//dfs 递归
DFS(Vertex S,Vertex G,HashSet visited, HashMap parents){
    if(S == G) retrun;
    for each of S's neighbors, node , not in visited
        add n to visited set
        add S as node;s parent in parents map
        DFS(node, G, visited, parents)
}

//dfs 循环
DFS(Vertex S,Vertex G){
    Initialize: stack, visited HashSet and parent Hashmap
    Push S onto the stack
    Add S to visited
    while stack is not empty:
        pop node curr from top of stack
        if curr == G return
        for each of curr's neightbors, node, not in visited
            add node to visited set
            add curr as node's parent in parent map
            push node onto stack 
}

// bfs
BFS(Vertex S,Vertex G){
    Initialize: queue, visited HashSet and parent Hashmap
        Enqueue S onto the queue
        Add S to visited
        while queue is not empty:
            dequeue node curr from front of queue
            if curr == G return
            for each of curr's neightbors, node, not in visited
                add node to visited set
                add curr as node's parent in parent map
                enqueue node onto queue 
}
```

### 练习
1. [迷宫](TheMaze.java)
2. [Flood Fill](FloodFill.java)
3. Friend Circles
4. Number of Islands
5. Max Area of lsland
6. Employee Importance
7. Is Graph Bipartite
8. Pacific Atlantic Water Flow
9. Longest Increasing Path in a Matrix
10. 01 Matrix
11. Accounts Merge
12. Word Ladder
13. Word Ladder II
