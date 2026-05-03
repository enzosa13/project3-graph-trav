import java.util.*;

public class Graph {
    private Map<String, List<String>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(String v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        adjList.get(from).add(to);
    }

    public List<String> getNeighbors(String v) {
        return adjList.get(v);
    }

    public static Graph buildTree(Map<String, String> parent) {
        Graph tree = new Graph();

        for (String child : parent.keySet()) {
            String p = parent.get(child);
            tree.addEdge(p, child);
        }
        return tree;
    }
}