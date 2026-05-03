import java.util.*;

public class BFS {
    private Graph graph;

    public BFS(Graph g) {
        this.graph = g;
    }

    public void traverse(String start) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        Set<String> visited = new HashSet<>();

        queue.enqueue(start);
        visited.add(start);

        System.out.print("BFS Order: ");

        while (!queue.isEmpty()) {
            String current = queue.dequeue();
            System.out.print(current + " ");

            for (String neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.enqueue(neighbor);
                }
            }
        }
    }

    public Map<String, String> traverse(Graph graph, String start) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        Map<String, String> parent = new HashMap<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            String node =  queue.poll();
            System.out.print(node + " ");

            for (String neighbor : graph.getNeighbors(node)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, node);
                    queue.add(neighbor);
                }
            }
        }
        return parent;
    }
}