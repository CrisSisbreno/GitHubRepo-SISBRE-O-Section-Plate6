package Plate_6;
import java.util.*;

public class problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int vertices = scanner.nextInt();

        System.out.println("Enter the number of edges:");
        int edges = scanner.nextInt();

        int[][] incidenceMatrix = new int[vertices][edges];
        int[][] edgeList = new int[edges][3];

        System.out.println("Enter the vertex pairs for the edges and their counts:");
        for (int i = 0; i < edges; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int count = scanner.nextInt();
            edgeList[i][0] = u;
            edgeList[i][1] = v;
            edgeList[i][2] = count;
        }

        for (int i = 0; i < edges; i++) {
            int u = edgeList[i][0];
            int v = edgeList[i][1];
            int count = edgeList[i][2];
            incidenceMatrix[u][i] += count;
            if (u != v) { // Avoid double counting loops
                incidenceMatrix[v][i] += count;
            }
        }

        System.out.println("Incidence Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < edges; j++) {
                System.out.print(incidenceMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
