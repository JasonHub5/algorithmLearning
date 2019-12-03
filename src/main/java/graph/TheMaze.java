/*
490.the maze(https://leetcode.com/articles/the-maze/)
There is a ball in a maze with empty spaces and walls. The ball can go through empty spaces by rolling up, down, left or right, but it won't stop rolling until hitting a wall. When the ball stops, it could choose the next direction.

Given the ball's start position, the destination and the maze, determine whether the ball could stop at the destination.

The maze is represented by a binary 2D array. 1 means the wall and 0 means the empty space. You may assume that the borders of the maze are all walls. The start and destination coordinates are represented by row and column indexes.

Example 1:

Input 1: a maze represented by a 2D array

0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0

Input 2: start coordinate (rowStart, colStart) = (0, 4)
Input 3: destination coordinate (rowDest, colDest) = (4, 4)

Output: true

Explanation: One possible way is : left -> down -> left -> down -> right -> down -> right.

Example 2:

Input 1: a maze represented by a 2D array

0 0 1 0 0
0 0 0 0 0
0 0 0 1 0
1 1 0 1 1
0 0 0 0 0

Input 2: start coordinate (rowStart, colStart) = (0, 4)
Input 3: destination coordinate (rowDest, colDest) = (3, 2)

Output: false

Explanation: There is no way for the ball to stop at the destination.



Note:

There is only one ball and one destination in the maze.
Both the ball and the destination exist on an empty space, and they will not be at the same position initially.
The given maze does not contain border (like the red rectangle in the example pictures), but you could assume the border of the maze are all walls.
The maze contains at least 2 empty spaces, and both the width and height of the maze won't exceed 100.
 */

package graph;

public class TheMaze {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze.length];
        return dfs(maze, start, destination, visited);
    }

    // up, down, left, right
    int[][] dirs = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public boolean dfs(int[][] maze, int[] start, int[] destination, boolean[][] visited) {
        if (visited[start[0]][start[1]]) {
            return false;
        }
        if (start[0] == destination[0] && start[1] == destination[1]) {
            return true;
        }
        visited[start[0]][start[1]] = true;
        for (int[] pair : dirs) {
            int x = start[0] + pair[0];
            int y = start[1] + pair[1];
            if (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] != 1) {
                return dfs(maze, new int[]{x, y}, destination, visited);
            }
//            while (x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] != 1) {
//                x += pair[0];
//                y += pair[1];
//            }
//            return dfs(maze, new int[]{x - pair[0], y - pair[1]}, destination, visited);
        }
        return false;

//        int right = start[1] + 1;
//        int left = start[1] - 1;
//        int up = start[0] - 1;
//        int down = start[0] + 1;
//
//        if (right < maze[0].length) {
//            return dfs(maze, new int[]{start[0], right}, destination, visited);
//        }
//        if (left >= 0) {
//            return dfs(maze, new int[]{start[0], left}, destination, visited);
//        }
//        if (up >= 0) {
//            return dfs(maze, new int[]{up, start[1]}, destination, visited);
//        }
//        if (down < maze.length) {
//            return dfs(maze, new int[]{down, start[1]}, destination, visited);
//        }

    }
}
