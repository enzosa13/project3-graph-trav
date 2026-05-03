public class Main {
    public static void main(String[] args) {
        Graph g = new Graph();

        // Add vertices
        String[] vertices = {"A","B","C","D","E","F","G","H","I"};
        for (String v : vertices) {
            g.addVertex(v);
        }

        // Add edges (directed)
        g.addEdge("A","B");
        g.addEdge("A","D");
        g.addEdge("A","E");
        g.addEdge("B","E");
        g.addEdge("D","G");
        g.addEdge("E","F");
        g.addEdge("E","H");
        g.addEdge("G","H");
        g.addEdge("F","C");
        g.addEdge("F","H");
        g.addEdge("H","I");
        g.addEdge("C","B");
        g.addEdge("I","F");

        BFS bfs = new BFS(g);
        bfs.traverse("A");

        Map<String, String> bfsParent = BFS.traverse(g, "A");
        Graph bfsTree = Graph.buildTree(bfsParent);
        System.out.print("\nBFS Tree Traversal: ");
        BFS.traverse(bfsTree, "A");

        Map<String, String, dfsParent> = DFS.traverse(g, "A");
        Graph dfsTree = Graph.buildTree(dfsParent);
        System.out.print("\n DFS Tree Traversal: ");
        DFS.traverse(dfsTree, "A");
    }
}