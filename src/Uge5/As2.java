package Uge5;

import java.awt.*;
import java.util.*;
import java.util.List;

public class As2 {

    public static int numOfNodes, numOfEdges, numOfNeighbourQueriesQ1, numOfNeighbourQueriesQ2;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       /* numOfIngredients = 4;
        numOfPairWise = 3;*/
        numOfNodes = scan.nextInt();
        numOfEdges = scan.nextInt();

        Graph graph = new Graph(numOfNodes, numOfEdges);

        Set<Integer>[] inputList = new HashSet[numOfEdges];

        // get all edges
        Set<Integer> inputs;
        for (int i = 0; i < numOfEdges; i++) {
            graph.addEdge(scan.nextInt(), scan.nextInt());
        }
       //numOfNeighbourQueriesQ1 = 2;
        numOfNeighbourQueriesQ1 = scan.nextInt();


        for (int i = 0; i < numOfNeighbourQueriesQ1; i++) {
        int node1 = scan.nextInt();
        int node2 = scan.nextInt();

            graph.isNeighbours(node1, node2);
        }

        //The number of Q2 queries
        //numOfNeighbourQueriesQ2 = 1;
        numOfNeighbourQueriesQ2 = scan.nextInt();

        for (int i = 0; i < numOfNeighbourQueriesQ2; i++) {
            graph.numberOfNeighbo(scan.nextInt());
        }
    }



        /*for (Vertex vert : graph.vertices) {
            System.out.println("vert " + vert.numInList);
            for (Integer neighs : vert.edges) {
                System.out.print("edge " + neighs);
            }
            System.out.println();
        }*/


    public static class Vertex {
        public int numInList;
        Set<Integer> edges;

        public Vertex(int num) {
            this.numInList = num;
            edges = new HashSet<>();
        }
    }

    public static class Graph {
        int numOfNodes;
        int numOfEdges;
        List<Vertex> vertices;


        private Graph(int nodes, int edges) {
            this.numOfNodes = nodes;
            this.numOfEdges = edges;
            vertices = new ArrayList<>();
            Vertex vertex;
            for (int i = 0; i < numOfNodes; i++) {
                vertex = new Vertex(i);
                vertices.add(vertex);
            }
        }

        public void addEdge(int node1, int node2) {
            vertices.get(node1).edges.add(node2);
            vertices.get(node2).edges.add(node1);
        }

        public void isNeighbours(int node1, int node2) {
            if (vertices.get(node1).edges.contains(node2))
                System.out.println("YES");
            else System.out.println("NO");
        }

        public void numberOfNeighbo(int targetNode) {
            ArrayList<Integer> neighbors = new ArrayList<>();
            for (Integer edge : vertices.get(targetNode).edges) {
                if (edge != targetNode) {
                    System.out.print(edge + " ");
                    // neighbors.add(edge);
                }
            }
            System.out.println();
            // return neighbors;
        }
    }
}