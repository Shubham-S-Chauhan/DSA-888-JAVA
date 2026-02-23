package com.dsa888.datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a graph node (used in graph clone / BFS / DFS problems).
 */
public class GraphNode {
    public int val;
    public List<GraphNode> neighbors;

    public GraphNode() {
        this.val = 0;
        this.neighbors = new ArrayList<>();
    }

    public GraphNode(int val) {
        this.val = val;
        this.neighbors = new ArrayList<>();
    }

    public GraphNode(int val, List<GraphNode> neighbors) {
        this.val = val;
        this.neighbors = neighbors;
    }
}
