package Plate_6;
import java.util.*;

public class problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();
        int[][] adjacencyMatrix = new int[vertices][vertices];

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        System.out.println("Enter the vertex pairs for the edges:");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();
            adjacencyMatrix[u][v] += weight;
        }

        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
