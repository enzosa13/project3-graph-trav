import java.util.*;

public class Tree {

    // DFS Tree
    public static Map<String, String> dfsTree(Graph graph, String start) {
        LinkedStack<String> stack = new LinkedStack<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        stack.push(start);
        visited.add(start);

        System.out.print("DFS Order: ");

        while (!stack.isEmpty()) {
            String current = stack.pop();
            System.out.print(current + " ");

            for (String neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    stack.push(neighbor);
                }
            }
        }

        return parent;
    }

    // BFS Tree
    public static Map<String, String> bfsTree(Graph graph, String start) {
        LinkedQueue<String> queue = new LinkedQueue<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parent = new HashMap<>();

        queue.enqueue(start);
        visited.add(start);

        System.out.print("BFS Order: ");

        while (!queue.isEmpty()) {
            String current = queue.dequeue();
            System.out.print(current + " ");

            for (String neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    parent.put(neighbor, current);
                    queue.enqueue(neighbor);
                }
            }
        }

        return parent;
    }

    // Print Tree
    public static void printTree(Map<String, String> parent) {
        System.out.println("\nTree edges:");
        for (String node : parent.keySet()) {
            System.out.println(parent.get(node) + " -> " + node);
        }
    }
}