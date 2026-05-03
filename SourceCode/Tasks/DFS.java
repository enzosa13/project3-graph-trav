//depth-first tree

public static Map<String, String> traverse(Graph graph, String start) {
    Set<String> visited = new HashSet<>();
    Stack<String> stack = new Stack<>();
    Map<String, String> parent = new HashMap<>();

    stack.push(start);

    while (!stack.isEmpty()) {
        String node = stack.pop();

        if (!visited.contains(node)) {
            visited.add(node);
            System.out.print(node + " ");

            for (String neighbor : g.getNeighbors(node)) {
                if (!visited.contains(neighbor)) {
                    parent.put(neighbor, node);
                    stack.push(neighbor);
                }
            }
        }
    }
    return parent;
}