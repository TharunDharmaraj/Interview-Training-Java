package ALLDS.Dijikstra;

import java.util.Stack;

class Dijkstra {
    private static int[] previous; // Added field

    public static void dijkstra(int[][] graph, int source) {
        int count = graph.length;
        boolean[] visitedVertex = new boolean[count];
        int[] distance = new int[count];
        previous = new int[count];

        for (int i = 0; i < count; i++) {
            visitedVertex[i] = false;
            distance[i] = Integer.MAX_VALUE;
            previous[i] = -1;
        }

        // Distance of self loop is zero
        distance[source] = 0;

        for (int i = 0; i < count; i++) {
            int u = findMinDistance(distance, visitedVertex);
            visitedVertex[u] = true;

            for (int v = 0; v < count; v++) {
                if (!visitedVertex[v] && graph[u][v] != 0 && (distance[u] + graph[u][v] < distance[v])) {
                    distance[v] = distance[u] + graph[u][v];
                    previous[v] = u;
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            System.out.println(String.format("Distance from %s to %s is %s", source, i, distance[i]));
        }
    }

    private static int findMinDistance(int[] distance, boolean[] visitedVertex) {
        int minDistance = Integer.MAX_VALUE;
        int minDistanceVertex = -1;
        for (int i = 0; i < distance.length; i++) {
            if (!visitedVertex[i] && distance[i] < minDistance) {
                minDistance = distance[i];
                minDistanceVertex = i;
            }
        }
        return minDistanceVertex;
    }

    public static void printPath(int[] previous, int destination) {
        if (previous[destination] == -1) {
            System.out.println("No path exists.");
            return;
        }

        Stack<Integer> path = new Stack<>();
        int vertex = destination;
        while (vertex != -1) {
            path.push(vertex);
            vertex = previous[vertex];
        }

        System.out.print("Path: ");
        while (!path.isEmpty()) {
            System.out.print(path.pop() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int graph[][] = new int[][] { { 0, 0, 1, 2, 0, 0, 0 }, { 0, 0, 2, 0, 0, 3, 0 }, { 1, 2, 0, 1, 3, 0, 0 },
                { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 } };

        int source = 0;
        int destination = 6;

        Dijkstra dijkstra = new Dijkstra();
        dijkstra(graph, source);
        dijkstra.printPath(dijkstra.previous, destination);
    }
}
