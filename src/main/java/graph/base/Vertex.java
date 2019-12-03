package graph.base;

import java.util.HashMap;
import java.util.HashSet;

public class Vertex {
    public int node;
    public HashMap<Vertex, Integer> adjacent;
    public int distance = Integer.MAX_VALUE;
    public boolean visited;
    public Vertex previous;

    public Vertex(int node) {
        this.node = node;
        adjacent = new HashMap<>();
    }

    public void addNeighbor(Vertex neighbor, int weight) {
        this.adjacent.put(neighbor, weight);
    }

    public HashMap<Vertex, Integer> getNeighbor() {
        return this.adjacent;
    }
}
