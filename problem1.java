package Plate_6;

import java.util.*;

public class problem1 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        List<List<Integer>> adjList = new ArrayList<>();

        System.out.println("Enter the edges of the graph: ");
        System.out.println("Enter a blank line to finish");
        while (true) {
            String line = sc.nextLine().trim();
            if (line.isEmpty()) {
                break;
            }
            String[] parts = line.split("\\s+");
            int u = Integer.parseInt(parts[0]);
            int v = Integer.parseInt(parts[1]);
            while (adjList.size() <= u || adjList.size() <= v) {
                adjList.add(new ArrayList<>());
            }
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        boolean[] visited = new boolean[adjList.size()];
        int numComponents = 0;
        for (int i = 0; i < adjList.size(); i++) {
            if (!visited[i]) {
                numComponents++;
                dfs(adjList, visited, i);
            }
        }
        if (numComponents == 1) {
            System.out.println("The graph is connected");
        } else {
            System.out.println("The graph is not connected");
            System.out.println("The number of connected components is " + numComponents);
        }

        sc.close();
    }
    private static void dfs(List<List<Integer>> adjList, boolean[] visited, int vertex) {
        visited[vertex] = true;
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfs(adjList, visited, neighbor);
            }
        }
    }

}