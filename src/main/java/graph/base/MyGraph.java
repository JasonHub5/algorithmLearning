package graph.base;

import java.util.*;

public class MyGraph {

    private HashMap<Integer, Vertex> vertDictionary;
    private int numVertices = 0;
    private boolean directed = false;

    public MyGraph() {
        vertDictionary = new HashMap<>();
    }

    public void addVertex(boolean directed) {
        this.directed = directed;
    }

    public boolean isDirected() {
        return directed;
    }

    public int getNumVertices() {
        return numVertices;
    }

    public void addVertex(int node) {
        vertDictionary.put(node, new Vertex(node));
        numVertices++;
    }

    public void addEdge(int from, int to, int cost) {
        if (!vertDictionary.containsKey(from)) {
            addVertex(from);
        }
        if (!vertDictionary.containsKey(to)) {
            addVertex(to);
        }
        vertDictionary.get(from).addNeighbor(vertDictionary.get(to), cost);
    }

    /**
     * dfs (recusion)
     *
     * @param start
     * @param end
     */
    public void dfs(Vertex start, Vertex end) {
        dfsHelper(start, end, new HashSet<Vertex>(), new HashMap<Vertex, Vertex>());
    }

    public void dfsHelper(Vertex start, Vertex end, HashSet<Vertex> visited, HashMap<Vertex, Vertex> parents) {
        if (end == start) {
            return;
        }
        HashMap<Vertex, Integer> neighbor = start.getNeighbor();
        for (Vertex node : neighbor.keySet()) {
            if (!visited.contains(node)) {
                visited.add(node);
                parents.put(node, start);
                dfsHelper(node, end, visited, parents);
            }
        }
    }

    /**
     * dfs (algorithm)
     *
     * @param start
     * @param end
     */
    public void dfs2(Vertex start, Vertex end) {
        Stack<Vertex> stack = new Stack<>();
        HashSet<Vertex> visited = new HashSet<>();
        HashMap<Vertex, Vertex> parents = new HashMap<>();
        stack.add(start);
        visited.add(start);
        while (!stack.isEmpty()) {
            Vertex curr = stack.pop();
            if (curr == end) {
                return;
            }

            for (Vertex node : curr.getNeighbor().keySet()) {
                if (!visited.contains(node)) {
                    visited.add(node);
                    stack.push(node);
                    parents.put(node, curr);
                }
            }
        }
    }

    /**
     * bfs
     *
     * @param start
     * @param end
     */
    public void bfs(Vertex start, Vertex end) {
        Queue<Vertex> queue = new LinkedList<>();
        HashSet<Vertex> visited = new HashSet<>();
        HashMap<Vertex, Vertex> parents = new HashMap<>();
        queue.offer(start);
        visited.add(start);
        while (!queue.isEmpty()) {
            Vertex curr = queue.poll();
            if (curr == end) {
                return;
            }
            for (Vertex node : curr.getNeighbor().keySet()) {
                if (!visited.contains(node)) {
                    visited.add(node);
                    parents.put(node, curr);
                    queue.offer(node);
                }
            }
        }
    }
}
