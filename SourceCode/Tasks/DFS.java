//depth-first tree
/**
 * make a tree and traverse it in depth-first order
 * create a stack and visited set to keep track of visited nodes.
 * loop while the stack is not empty.
 * pop the current node and print it
 */
import java.util.*;
public class DFS {
    private Graph graph;

    public DFS(Graph graph) {
        this.graph = graph;
    }

    public void traverse(String start){
        LinkedStack<String> stack = new LinkedStack<>();
        Set<String> visited = new HashSet<>();

        stack.push(start);
        visited.add(start);
        System.out.print("DFS Order: ");

        while (!stack.isEmpty()) {
            String current = stack.pop();
            System.out.print(current + " ");

            for (String neighbor : graph.getNeighbors(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    stack.push(neighbor);
                }
            }
        }
    }
}