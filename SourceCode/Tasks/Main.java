import java.util.Map;

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

        //task 1
        BFS bfs = new BFS(g);
        bfs.traverse("A");

        System.out.println();

        //task 2
        DFS dfs = new DFS(g);
        dfs.traverse("A");
        System.out.println("\n");

        //task 3
        Map<String, String> bfsTree = Tree.bfsTree(g, "A");
        Tree.printTree(bfsTree);

        System.out.println();

        Map<String, String> dfsTree = Tree.dfsTree(g, "A");
        Tree.printTree(dfsTree);
    }
}